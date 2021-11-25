package com.yeahbutstill.controller;

import com.yeahbutstill.repo.MyRepository;
import com.yeahbutstill.service.MyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyController {

    private static final Logger log = LoggerFactory.getLogger(MyController.class);

    private MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

      // Manual String log
//    public void save(String requestId) {
//
//        log.info("{} - Controller Save", requestId);
//        this.myService.save(requestId);
//    }

    public void save() {
        log.info("Controller Save");
        this.myService.save();
    }

}
