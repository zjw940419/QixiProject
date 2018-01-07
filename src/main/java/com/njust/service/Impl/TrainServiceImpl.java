package com.njust.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.njust.dataobject.*;
import com.njust.form.TodayQueryForm;
import com.njust.mapper.*;

import com.njust.service.TrainService;
import com.njust.utils.DateUtil;
import com.njust.utils.PageBean;
import com.njust.utils.StringUtil;
import com.njust.vo.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by zhujiawei on 2017/12/29.
 */
@Service
public class TrainServiceImpl implements TrainService {

    @Autowired
    private TrainInfoMapper trainInfoMapper;

    @Autowired
    private TrainDataMapper trainDataMapper;

    @Autowired
    private MotorInfoMapper motorInfoMapper;
    
    @Autowired
    private GearInfoMapper gearInfoMapper;

    @Autowired
    private TrainSpecialDataMapper trainSpecialDataMapper;


    /**
     * 根据列车记录编号查询出 列车的综合信息
     * @param trainOnlyid
     * @return
     */
    @Override
    public ResultVO findTrainInfoByTrainOnlyid(Long trainOnlyid) {
        ResultVO resultVO=new ResultVO();
        resultVO.setData(this.findByTrainOnlyid(trainOnlyid));
        return resultVO;
    }

    /**
     * 根据时间 返回当日的行车数据 形成分页报表每页显示26条  已经完成分页功能
     * @param pre
     * @param after
     * @return
     */
    @Override
    public ResultVO findByTrainDate(Date pre,Date after,Integer page,Integer size){
        //设置分页信息
        ResultVO resultVO=new ResultVO();
        PageHelper.startPage(page,size);
        List<TrainData> trainDataList = trainDataMapper.findByTrainDateBetween(pre, after);
        List<TrainDataVO> trainDataVOList=new ArrayList<>();

        for (TrainData trainData:trainDataList){
            TrainDataVO trainDataVO= this.findByTrainOnlyid(trainData.getTrainOnlyid());
            trainDataVOList.add(trainDataVO);
        }
        PageInfo<TrainDataVO> pageInfo=new PageInfo<>(trainDataVOList);
        resultVO.setData(pageInfo);
        return resultVO;
    }

    /**
     * 当日运营结束返回 定时返回的数据
     * @param pre
     * @param after
     * @return
     */
    @Override
    public ResultVO todayLast10(Date pre,Date after){
        ResultVO resultVO=new ResultVO();
        List<QixiMinVO> qixiMinVOList=new ArrayList<>();
        //查出10记录
        List<TrainSpecialData> trainSpecialDataList
                = trainSpecialDataMapper.findMinInfoByDatetime(pre, after);
        //根据十条记录的ID查询出具体的内容
        for (TrainSpecialData trainSpecialData:trainSpecialDataList){
            QixiMinVO qixiMinVO=new QixiMinVO();
            TrainInfo trainInfo = trainInfoMapper.selectByPrimaryKey(trainSpecialData.getTrainOnlyid());
            qixiMinVO.setTrainId(trainInfo.getTrainId());
            qixiMinVO.setControlNum(trainInfo.getControlNum());
            qixiMinVO.setTrainDate(trainInfo.getTrainDate());
            qixiMinVO.setMotorNum(trainSpecialData.getMotorNum());
            qixiMinVO.setTlgapMin(trainSpecialData.getTlgapMin());
            qixiMinVO.setSlgapMin(trainSpecialData.getSlgapMin());
            qixiMinVOList.add(qixiMinVO);
        }
        resultVO.setData(qixiMinVOList);
        return resultVO;
    }

    @Override
    public ResultVO TodayQuery(TodayQueryForm todayQueryForm) throws ParseException {
        List<TodayQueryVO> todayQueryVOList=new ArrayList<>();

        Date firsttime = DateUtil.String2Date(todayQueryForm.getTrainDate());
        long time=firsttime.getTime()+86400000;
        Date secondtime=new Date(time);
        //根据时间查询出主表的信息
        PageHelper.startPage(todayQueryForm.getPageNum(),todayQueryForm.getPageSize());
        List<TrainInfo> trainInfoList = trainInfoMapper
                .findTrainInfoByDatetime(firsttime, secondtime);
        for (TrainInfo trainInfo:trainInfoList){
            TodayQueryVO todayQueryVO=new TodayQueryVO();

            List<MotorInfo> motorInfoList = motorInfoMapper
                    .findByTrainIdOrderByMotorNum(trainInfo.getTrainOnlyid());

            BeanUtils.copyProperties(trainInfo,todayQueryVO);

            for (MotorInfo motorInfo:motorInfoList){
                TodayQueryMotorVO todayQueryMotorVO=new TodayQueryMotorVO();

                todayQueryMotorVO.setMotorNum(motorInfo.getMotorNum());

                List<GearInfo> gearInfoList = gearInfoMapper.findByMotorIdAndInGearNum(motorInfo.getMotorId()
                        ,todayQueryForm.getFirstGap(), todayQueryForm.getSecondGap());

                for (GearInfo gearInfo:gearInfoList){
                    BeanUtils.copyProperties(gearInfo,todayQueryMotorVO);
                }


            }
        }

        return null;
    }

    /**
     * 分装的函数 根据列车记录的ID查询到列车的VO信息
     * @param trainOnlyid
     * @return
     */
    @Override
    public TrainDataVO findByTrainOnlyid(Long trainOnlyid) {

        TrainDataVO trainDataVO=new TrainDataVO();
        TrainData trainData = trainDataMapper.selectByPrimaryKey(trainOnlyid);
        TrainInfo trainInfo = trainInfoMapper.selectByPrimaryKey(trainOnlyid);
        //直系属性进行复制
        BeanUtils.copyProperties(trainData,trainDataVO);
        BeanUtils.copyProperties(trainInfo,trainDataVO);
        trainDataVO.setTrainDate(DateUtil.Date2String(trainInfo.getTrainDate()));

        //根据列车记录号和电机号 查询到左和右气隙最小值的对象
        //MotorInfo LmotorInfo = motorInfoRepository
        //        .findByTrainIdAndMotorNum(trainId, trainData.getLgapMin());
        //MotorInfo RmotorInfo = motorInfoRepository
        //        .findByTrainIdAndMotorNum(trainId, trainData.getRgapMin());
        //
        ////取到对应的左边气隙的具体数据
        //GearInfo LgearInfo = gearInfoRepository
        //        .findByMotorIdAndGearNum(LmotorInfo.getMotorId(), LmotorInfo.getGapMin());
        //GearInfo RgearInfo = gearInfoRepository
        //        .findByMotorIdAndGearNum(RmotorInfo.getMotorId(), RmotorInfo.getGapMin());

        //根据列车记录编号和电机号 查询左右槽楔最小值的对象

        //优化代码 遍历电机号(1-8)
        List<MotorInfo> motorInfoList = motorInfoMapper.findByTrainIdOrderByMotorNum(trainOnlyid);
        for (MotorInfo motorInfo:motorInfoList){
            //气隙的数据处理
            if(motorInfo.getMotorNum().equals(trainData.getLgapMin())){
                //左气隙最小值
                GearInfo lgearInfo1 = gearInfoMapper
                        .findByMotorIdAndGearNum(motorInfo.getMotorId(), motorInfo.getLgapMin());
                trainDataVO.setLgapMin(StringUtil.changeStr(lgearInfo1.getLgapValue(),trainData.getLgapMin()));
            }

            if(motorInfo.getMotorNum().equals(trainData.getRgapMin())){
                GearInfo rgearInfo1 = gearInfoMapper
                        .findByMotorIdAndGearNum(motorInfo.getMotorId(), motorInfo.getRgapMin());
                trainDataVO.setRgapMin(StringUtil.changeStr(rgearInfo1.getRgapValue(),trainData.getRgapMin()));
            }
            //槽楔的数据处理
            if(motorInfo.getMotorNum().equals(trainData.getLslotMin())){
                GearInfo lslotInfo = gearInfoMapper
                        .findByMotorIdAndGearNum(motorInfo.getMotorId(), motorInfo.getLslotMin());
                trainDataVO.setLslotMin(StringUtil.changeStr(lslotInfo.getLslotDepth(),trainData.getLslotMin()));
            }

            if(motorInfo.getMotorNum().equals(trainData.getRslotMin())){
                GearInfo rslotInfo = gearInfoMapper
                        .findByMotorIdAndGearNum(motorInfo.getMotorId(), motorInfo.getRslotMin());
                trainDataVO.setRslotMin(StringUtil.changeStr(rslotInfo.getRslotDepth(),trainData.getRslotMin()));
            }
            //电机温度的数据处理
            if(motorInfo.getMotorNum().equals(trainData.getTempMax())){
                trainDataVO.setTempMax(StringUtil.changeStr(motorInfo.getTempMax(),trainData.getTempMax()));
            }
        }
        //数据进行封装
        //trainDataVO.setLgapMin(StringUtil.changeStr(LgearInfo.getLgapValue(),trainData.getLgapMin()));
        //trainDataVO.setRgapMin(StringUtil.changeStr(RgearInfo.getRgapValue(),trainData.getRgapMin()));
        return trainDataVO;
    }

}
