package com.njust.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.njust.dataobject.GearInfo;
import com.njust.dataobject.MotorInfo;
import com.njust.dataobject.TrainInfo;
import com.njust.form.SlotForm;
import com.njust.mapper.GearInfoMapper;
import com.njust.mapper.MotorInfoMapper;

import com.njust.mapper.TrainInfoMapper;
import com.njust.service.GearService;
import com.njust.utils.DateUtil;
import com.njust.vo.GearVO;
import com.njust.vo.ResultVO;
import com.njust.vo.SlotTendencyVO;
import com.njust.vo.SlotVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
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

    @Autowired
    private TrainInfoMapper trainInfoMapper;

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


    /**
     * 槽楔趋势查询分析
     * @param slotForm
     * @return
     */
    public ResultVO slotTrendencyQuery(SlotForm slotForm) throws ParseException {
        ResultVO resultVO=new ResultVO();
        List<SlotTendencyVO> slotTendencyVOList=new ArrayList<>();
        //根据时间段选出列车记录编号
        Date start= DateUtil.String2Date(slotForm.getStartTime());
        Date end=DateUtil.String2Date(slotForm.getEndTime());
        PageHelper.startPage(slotForm.getPageNum(),slotForm.getPageSize());
        List<TrainInfo> trainInfoList = trainInfoMapper
                .findByTrainDateAndDirection(start, end, slotForm.getTrainNumber(),slotForm.getTrainDirection());
        for (TrainInfo trainInfo:trainInfoList){
            SlotTendencyVO slotTendencyVO=new SlotTendencyVO();
            //根据电机的编号和列车记录编号 查询到具体的列车记录编号
            MotorInfo motorInfo = motorInfoMapper
                    .findByTrainIdAndMotorNum(trainInfo.getTrainId(), slotForm.getMotorNum());
            slotTendencyVO.setTrainDate(DateUtil.Date2String(trainInfo.getTrainDate()));
            slotTendencyVO.setTrainNumber(trainInfo.getTrainNumber());
            slotTendencyVO.setTrainDirection(trainInfo.getTrainDirection());
            slotTendencyVO.setMotorNum(motorInfo.getMotorNum());
            //电机编号和具体的齿编号 查询到结果7 73齿的槽楔数据
            List<GearInfo> gearInfoList = gearInfoMapper.
                    findByMotorIdAndInGearNum(motorInfo.getMotorId(), slotForm.getFirstSlot(), slotForm.getSecondSlot());
            List<SlotVO> slotVOList = assembleGearInfo(gearInfoList);
            slotTendencyVO.setSlotVOList(slotVOList);
            slotTendencyVOList.add(slotTendencyVO);
        }
        PageInfo<SlotTendencyVO> pageInfo=new PageInfo<>(slotTendencyVOList);
        resultVO.setData(pageInfo);
        return resultVO;
    }

    /**
     * 转化为 分装槽楔的数据
     * @param gearInfoList
     * @return
     */
    public List<SlotVO> assembleGearInfo(List<GearInfo> gearInfoList){
        List<SlotVO> slotVOList=new ArrayList<>();
        for (GearInfo gearInfo:gearInfoList){
            SlotVO slotVO=new SlotVO();
            slotVO.setGearNum(gearInfo.getGearNum());
            slotVO.setLslotValue(gearInfo.getLslotValue());
            slotVO.setRslotValue(gearInfo.getRslotValue());
            slotVO.setLslotDepth(gearInfo.getLslotDepth());
            slotVO.setRslotDepth(gearInfo.getRslotDepth());
            slotVOList.add(slotVO);
        }
        return slotVOList;
    }
}
