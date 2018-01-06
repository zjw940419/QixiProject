package com.njust.service.Impl;


import com.njust.dataobject.GearInfo;
import com.njust.dataobject.MotorInfo;
import com.njust.dataobject.TrainInfo;
import com.njust.dataobject.TrainLaser;
import com.njust.mapper.GearInfoMapper;
import com.njust.mapper.MotorInfoMapper;
import com.njust.mapper.TrainInfoMapper;
import com.njust.mapper.TrainLaserMapper;

import com.njust.service.MotorService;
import com.njust.utils.StringUtil;
import com.njust.vo.MotorDataVO;
import com.njust.vo.MotorVO;
import com.njust.vo.ResultVO;
import com.njust.vo.TrainLaserData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by zhujiawei on 2017/12/28.
 */
@Service
@Slf4j
public class MotorServiceImpl implements MotorService {

    @Autowired
    private TrainLaserMapper trainLaserMapper;

    @Autowired
    private MotorInfoMapper motorInfoMapper;

    @Autowired
    private TrainInfoMapper trainInfoMapper;

    @Autowired
    private GearInfoMapper gearInfoMapper;



    /**
     * 查询dao层 返回左右激光原始数据
     * @param trainId
     * @param motorNum
     * @return
     */
    @Override
    public ResultVO findByTrainIdAndMotorNum(Long trainId, Integer motorNum) {
        Map<String,List<Double>> map=new HashMap<>();
        ResultVO<Map<String,List<Double>>> resultVO=new ResultVO<>();
        List<TrainLaser> trainLaserDataList = trainLaserMapper.findByTrainIdAndMotorNum(trainId, motorNum);
        //数据的封装 左右激光数据加入
        List<Double> leftLaserData=trainLaserDataList.stream().map(e->
                new Double(e.getLeftLaser())
        ).collect(Collectors.toList());

        List<Double> rightLaserData=trainLaserDataList.stream().map(e->
                new Double(e.getRightLaser())
        ).collect(Collectors.toList());
        //封装到ResultVO
        map.put("left",leftLaserData);
        map.put("right",rightLaserData);
        resultVO.setData(map);
        return resultVO;
    }
    /**
     * 根据车号 返回电机的详细报表
     * @param trainId
     * @return
     */
    @Override
    public ResultVO findByTrainId(Long trainId){

        ResultVO resultVO=new ResultVO();
        MotorDataVO motorDataVO=new MotorDataVO();
        List<MotorVO> motorVOList=new ArrayList<>();
        //筛选出8条记录 电机
        List<MotorInfo> motorInfoList = motorInfoMapper.findByTrainIdOrderByMotorNum(trainId);
        //查询主表
        TrainInfo trainInfo = trainInfoMapper.selectByPrimaryKey(trainId);
        //基本信息进行复制
        BeanUtils.copyProperties(trainInfo,motorDataVO);
        //处理八个电机的具体数据
        for(MotorInfo motorInfo:motorInfoList){
            MotorVO motorVO=new MotorVO();
            //具体齿的数据（左/右）
            GearInfo LgapInfo = gearInfoMapper.findByMotorIdAndGearNum(motorInfo.getMotorId(), motorInfo.getLgapMin());
            GearInfo RgapInfo = gearInfoMapper.findByMotorIdAndGearNum(motorInfo.getMotorId(),motorInfo.getRgapMin());

            //槽楔数据 （左/右）

            GearInfo LSlotInfo=gearInfoMapper.findByMotorIdAndGearNum(motorInfo.getMotorId(),motorInfo.getLslotMin());
            GearInfo RSlotInfo=gearInfoMapper.findByMotorIdAndGearNum(motorInfo.getMotorId(),motorInfo.getRslotMin());

            //todo 要判断为空怎么处理
            //数据分装
            motorVO.setLgapMin(StringUtil.changeChi(LgapInfo.getLgapValue(),motorInfo.getLgapMin()));
            motorVO.setRgapMin(StringUtil.changeChi(RgapInfo.getRgapValue(),motorInfo.getRgapMin()));
            motorVO.setLslotMin(StringUtil.changeCao(LSlotInfo.getLslotDepth(),motorInfo.getLslotMin()));
            motorVO.setRslotMin(StringUtil.changeCao(RSlotInfo.getRslotDepth(),motorInfo.getRslotMin()));
            motorVO.setTempAverage(motorInfo.getTempAverage());

            motorVOList.add(motorVO);
        }
        motorDataVO.setMotorVOList(motorVOList);
        resultVO.setData(motorDataVO);
        return resultVO;
    }
}
