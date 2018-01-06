package com.njust.controller;


import com.njust.form.SlotForm;
import com.njust.service.GearService;
import com.njust.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

@RestController
@RequestMapping("/history")
public class HistoryController {
    @Autowired
    private GearService gearService;

    @RequestMapping(value = "/slotTrendency",method = RequestMethod.POST)
    public ResultVO SlotTrendency(@RequestBody SlotForm slotForm) throws ParseException {

        ResultVO resultVO = gearService.SlotTrendencyQuery(slotForm);
        return resultVO;
    }


}
