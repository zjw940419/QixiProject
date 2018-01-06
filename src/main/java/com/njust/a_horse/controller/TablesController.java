package com.njust.a_horse.controller;

import com.njust.a_horse.request_vo.TableQueryByState;
import com.njust.a_horse.response_vo.TableResponseByState;
import com.njust.a_horse.service.TablesService;
import com.njust.dataobject.TrainInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Description:
 * 报表查询的Controller
 * Create by User: HorseChestnut
 * Date: 2018-01-05
 */
@RestController
@RequestMapping("/table")
public class TablesController {

    @Autowired
    TablesService tablesService;
    /**
     * 查询报表的详细信息，根据状态条件。
     * @param queryByState
     * @return
     */
    @PostMapping("/state")
    public List<TableResponseByState> getTrainInfos(@RequestBody TableQueryByState queryByState){
        /**
         * 查询报表的流程。
         * 1.根据条件来查询。
         */
        tablesService.getTrainInfos(queryByState);
        return  null;
    }






}
