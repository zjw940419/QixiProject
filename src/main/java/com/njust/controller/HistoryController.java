package com.njust.controller;


import com.njust.form.SlotForm;
import com.njust.form.TodayQueryForm;
import com.njust.service.GearService;
import com.njust.utils.DateUtil;
import com.njust.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.Date;

@RestController
@RequestMapping("/history")
public class HistoryController {
    @Autowired
    private GearService gearService;

    /**
     * 槽楔历史趋势的查询
     * @param slotForm
     * @return
     * @throws ParseException
     */
    @RequestMapping(value = "/slotTrendency",method = RequestMethod.POST)
    public ResultVO SlotTrendency(@RequestBody SlotForm slotForm) throws ParseException {

        ResultVO resultVO = gearService.slotTrendencyQuery(slotForm);
        return resultVO;
    }


    /**
     * 当日车历史查询
     * @param queryForm
     * @return
     */
    @RequestMapping(value = "/todayQuery")
    public ResultVO TodayQuery(@RequestBody TodayQueryForm queryForm) throws ParseException {


        return null;
    }
}
