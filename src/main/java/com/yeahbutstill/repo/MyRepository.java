package com.yeahbutstill.repo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyRepository {

    private static final Logger log = LoggerFactory.getLogger(MyRepository.class);

    // Manual String log
//    public void save(String requestId) {
//
//        log.info("{} - Repository Save", requestId);
//
//    }

    public void save() {
        log.info("Repository Save");
    }


}
