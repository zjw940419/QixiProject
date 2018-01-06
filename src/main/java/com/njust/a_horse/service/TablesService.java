package com.njust.a_horse.service;

import com.njust.a_horse.request_vo.TableQueryByState;
import com.njust.dataobject.TrainInfo;

import java.util.List;

/**
 * Description:
 * Create by User: HorseChestnut
 * Date: 2018-01-06
 */
public interface TablesService {
    List<TrainInfo> getTrainInfos(TableQueryByState table);
}
