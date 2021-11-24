package com.yeahbutstill;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class LogFormatTest {

  private final Logger log = LoggerFactory.getLogger(LogFormatTest.class);

  @Test
  void testLogFormat() {

    log.info("Without Parameter");
    log.info("{} + {} = {}", 10, 10, (10 + 10));
    log.error("Ups", new NullPointerException());
  }
}
