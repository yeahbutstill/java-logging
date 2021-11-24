package com.yeahbutstill;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LevelTest {

    private static final Logger log = LoggerFactory.getLogger(LevelTest.class);

  @Test
  void testLevel() {

      // Level dari rendah ke tinggi
      log.trace("Trace");  // Secara default implementasi logback dia hanya memunculkan level Debug ke atas
      log.debug("Debug");
      log.info("Info");
      log.warn("Warning");
      log.error("Error");

  }
}
