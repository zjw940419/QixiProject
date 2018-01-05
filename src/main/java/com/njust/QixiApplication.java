package com.njust;

import com.github.pagehelper.PageHelper;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.Properties;

/**
 * Created by zhujiawei on 2017/12/28.
 */
@SpringBootApplication
@EntityScan("com.njust.dataobject")
@MapperScan("com.njust.mapper")
@EnableScheduling
public class QixiApplication {
    @Bean
     public PageHelper pageHelper(){
                 PageHelper pageHelper = new PageHelper();
                 Properties properties = new Properties();
                 properties.setProperty("offsetAsPageNum","true");
                properties.setProperty("rowBoundsWithCount","true");
                properties.setProperty("reasonable","true");
                properties.setProperty("dialect","mysql");    //配置mysql数据库的方言
                pageHelper.setProperties(properties);
                 return pageHelper;
             }
    public static void main(String[] args) {
        SpringApplication.run(QixiApplication.class, args);
    }
}
