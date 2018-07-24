package com.example.demo;

import com.example.demo.mapper.CityMapper;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


import java.util.Iterator;

//add some data to init
//no @Component, this will not call
@Component
public class Init implements ApplicationListener<ContextRefreshedEvent> {

    final private CityMapper cityMapper;

    public Init(CityMapper cityMapper){
        this.cityMapper = cityMapper;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println(this.cityMapper.findByState("CA"));
    }
}
