package com.njust.a_horse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description:
 * Create by User: HorseChestnut
 * Date: 2018-01-05
 */
@Controller
public class PageController {

    @RequestMapping("/")
    public String welcome(){

        return "index";

    }
}
