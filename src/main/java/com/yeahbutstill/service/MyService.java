package com.yeahbutstill.service;

import com.yeahbutstill.repo.MyRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyService {

    private static final Logger log = LoggerFactory.getLogger(MyService.class);

    private MyRepository myRepository;

    public MyService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    // Manual String log
//    public void save(String requestId) {
//
//        log.info("{} - Service Save", requestId);
//        this.myRepository.save(requestId);
//    }

    public void save() {
        log.info("Service Save");
        this.myRepository.save();
    }

}
