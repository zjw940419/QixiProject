package com.njust.service.Impl;

import com.njust.dataobject.GearInfo;
import com.njust.dataobject.MotorInfo;

import com.njust.mapper.GearInfoMapper;
import com.njust.mapper.MotorInfoMapper;
import com.njust.service.GearService;
import com.njust.vo.GearVO;
import com.njust.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhujiawei on 2017/12/30.
 */
@Service
@Slf4j
public class GearServiceImpl implements GearService{

    @Autowired
    private GearInfoMapper gearInfoMapper;

    @Autowired
    private MotorInfoMapper motorInfoMapper;

    /**
     * 根据列车记录编号 和 电机号 查询到所有齿的数据
     * @param trainId
     * @param motorNum
     * @return
     */
    @Override
    public ResultVO findByTrainIdAndMotorId(Long trainId,Integer motorNum) {
        ResultVO resultVO=new ResultVO();
        List<GearVO> gearVOList=new ArrayList<>();
        MotorInfo motorInfo = motorInfoMapper.findByTrainIdAndMotorNum(trainId, motorNum);
        List<GearInfo> gearInfoList = gearInfoMapper.findByMotorId(motorInfo.getMotorId());
        for (GearInfo gearInfo:gearInfoList){
            GearVO gearVO=new GearVO();
            BeanUtils.copyProperties(gearInfo,gearVO);
            gearVOList.add(gearVO);
        }
        resultVO.setData(gearVOList);
        return resultVO;
    }
}
