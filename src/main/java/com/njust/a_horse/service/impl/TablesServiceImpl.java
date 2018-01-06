package com.njust.a_horse.service.impl;

import com.github.pagehelper.PageHelper;
import com.njust.a_horse.request_vo.TableQueryByState;
import com.njust.a_horse.service.TablesService;
import com.njust.a_horse.utils.DateUtil;
import com.njust.dataobject.*;
import com.njust.mapper.GearInfoMapper;
import com.njust.mapper.MotorInfoMapper;
import com.njust.mapper.TrainDataMapper;
import com.njust.mapper.TrainInfoMapper;
import com.njust.vo.TrainDataVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * Create by User: HorseChestnut
 * Date: 2018-01-06
 */
@Service
public class TablesServiceImpl implements TablesService{

    @Autowired
    TrainInfoMapper trainInfoMapper;
    @Autowired
    TrainDataMapper trainDataMapper;
    @Autowired
    MotorInfoMapper motorInfoMapper;
    @Autowired
    GearInfoMapper gearInfoMapper;
    /**
     * 在列车主信息中查询。
     * @param table
     * @return 返回相关列车信息。
     */
    @Override
    public List<TrainDataVO> getTrainInfos(TableQueryByState table){
        PageHelper.startPage(table.getPage(),table.getPageSize());
        TrainInfoExample example = new TrainInfoExample();
        TrainInfoExample.Criteria criteria= example.createCriteria();
        criteria.andTrainDateBetween(DateUtil.getDate(table.getStartTime()),
                DateUtil.getDate(table.getEndTime()));
        if(table.getTrainState() != null){
            criteria.andTrainStateEqualTo(table.getTrainState());
        }
        if(table.getTrainNumber() != null){
            criteria.andTrainNumberEqualTo(table.getTrainNumber());
        }
        if(table.getTrainStation() != null){
            criteria.andTrainStationEqualTo(table.getTrainStation());

        }
        if(table.getTrainDirection() != null){
            criteria.andTrainDirectionEqualTo(table.getTrainDirection());
        }

        List<TrainInfo> infos = trainInfoMapper.selectByExample(example);
        List<TrainDataVO> dataVOList = new ArrayList<>();
        for(TrainInfo info : infos){
            Resultv
            trainId
        }
        return null;
    }

    /**
     * 根据trainId 查询相应的详细TrainData
     * @param trainId
     * @return
     */
    public TrainData getTrainDataByTrainId(Long trainId){
        TrainData data = trainDataMapper.selectByPrimaryKey(trainId);
        return data;
    }

    /**
     * 根据motorid去查询相应的最大最小齿轮的id值。
     * @param motorId
     * @return
     */
    public MotorInfo getMotorByMotorId(Long motorId){
        MotorInfo info = motorInfoMapper.selectByPrimaryKey(motorId);
        return info;
    }

    /**
     * 根据gearid去查询齿轮和槽戏的值。
     * @param gearId
     * @return
     */
    public GearInfo getGearByGearId(Long gearId){
        return gearInfoMapper.selectByPrimaryKey(gearId);
    }


}
