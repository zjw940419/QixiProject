package com.njust.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.njust.dataobject.*;
import com.njust.mapper.*;

import com.njust.service.TrainService;
import com.njust.utils.StringUtil;
import com.njust.vo.ResultVO;
import com.njust.vo.TrainDataVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
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
     * @param trainId
     * @return
     */
    @Override
    public ResultVO findTrainInfoByTrainId(Long trainId) {
        ResultVO resultVO=new ResultVO();
        resultVO.setData(this.findByTrainId(trainId));
        return resultVO;
    }

    /**
     * 根据时间 返回当日的行车数据 形成分页报表每页显示26条
     * @param pre
     * @param after
     * @return
     */
    public ResultVO findByTrainDate(Date pre,Date after,Integer page,Integer size){
        PageHelper.startPage(page,size);
        ResultVO resultVO=new ResultVO();
        List<TrainData> trainDataList = trainDataMapper.findByTrainDateBetween(pre, after);

        List<TrainDataVO> trainDataVOList=new ArrayList<>();
        PageInfo<TrainDataVO> pageInfo=new PageInfo();
        for (TrainData trainData:trainDataList){
            TrainDataVO trainDataVO= this.findByTrainId(trainData.getTrainId());
            trainDataVOList.add(trainDataVO);
        }
        pageInfo.setList(trainDataVOList);
        resultVO.setData(pageInfo);
        return resultVO;
    }

    /**
     * 返回当日的最后10条气隙最小的数据
     * @return
     */
    public TrainSpecialData TodayLast10(Date pre,Date after){
        //查出10记录
        List<TrainSpecialData> trainSpecialDataList
                = trainSpecialDataMapper.findMinInfoByDatetime(pre, after);
        //根据十条记录的ID查询出具体的内容
        for (TrainSpecialData trainSpecialData:trainSpecialDataList){
            TrainInfo trainInfo = trainInfoMapper.selectByPrimaryKey(trainSpecialData.getTrainId());

        }
    }

    /**
     * 分装的函数 根据列车记录的ID查询到列车的VO信息
     * @param trainId
     * @return
     */
    @Override
    public TrainDataVO findByTrainId(Long trainId) {

        TrainDataVO trainDataVO=new TrainDataVO();
        TrainData trainData = trainDataMapper.selectByPrimaryKey(trainId);
        TrainInfo trainInfo = trainInfoMapper.selectByPrimaryKey(trainId);
        //直系属性进行复制
        BeanUtils.copyProperties(trainData,trainDataVO);
        BeanUtils.copyProperties(trainInfo,trainDataVO);

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
        List<MotorInfo> motorInfoList = motorInfoMapper.findByTrainIdOrderByMotorNum(trainId);
        for (MotorInfo motorInfo:motorInfoList){
            //气隙的数据处理
            if(motorInfo.getMotorNum()==trainData.getLgapMin()){
                //左气隙最小值
                GearInfo LgearInfo1 = gearInfoMapper
                        .findByMotorIdAndGearNum(motorInfo.getMotorId(), motorInfo.getLgapMin());
                trainDataVO.setLgapMin(StringUtil.changeStr(LgearInfo1.getLgapValue(),trainData.getLgapMin()));
            }

            if(motorInfo.getMotorNum()==trainData.getRgapMin()){
                GearInfo RgearInfo1 = gearInfoMapper
                        .findByMotorIdAndGearNum(motorInfo.getMotorId(), motorInfo.getRgapMin());
                trainDataVO.setRgapMin(StringUtil.changeStr(RgearInfo1.getRgapValue(),trainData.getRgapMin()));
            }
            //槽楔的数据处理
            if(motorInfo.getMotorNum()==trainData.getLslotMin()){
                GearInfo LslotInfo = gearInfoMapper
                        .findByMotorIdAndGearNum(motorInfo.getMotorId(), motorInfo.getLslotMin());
                trainDataVO.setLslotMin(StringUtil.changeStr(LslotInfo.getLslotDepth(),trainData.getLslotMin()));
            }

            if(motorInfo.getMotorNum()==trainData.getRslotMin()){
                GearInfo RslotInfo = gearInfoMapper
                        .findByMotorIdAndGearNum(motorInfo.getMotorId(), motorInfo.getRslotMin());
                trainDataVO.setRslotMin(StringUtil.changeStr(RslotInfo.getLslotDepth(),trainData.getRslotMin()));
            }
            //电机温度的数据处理
            if(motorInfo.getMotorNum()==trainData.getTempMax()){
                trainDataVO.setTempMax(StringUtil.changeStr(motorInfo.getTempMax(),trainData.getTempMax()));
            }
        }
        //数据进行封装
        //trainDataVO.setLgapMin(StringUtil.changeStr(LgearInfo.getLgapValue(),trainData.getLgapMin()));
        //trainDataVO.setRgapMin(StringUtil.changeStr(RgearInfo.getRgapValue(),trainData.getRgapMin()));
        return trainDataVO;
    }

}
