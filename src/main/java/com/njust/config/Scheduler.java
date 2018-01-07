package com.njust.config;


import com.njust.service.TrainService;
import com.njust.vo.TrainDataVO;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Scheduler {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TrainService trainService;

    //@Scheduled(fixedRate=5000)
    public void testTasks() {
        TrainDataVO trainDataVO = trainService.findByTrainOnlyid(new Long(1));
        System.out.println(trainDataVO);
    }

    //@Scheduled(cron = "50 16 20 * * ?")
}
