package contoh;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class ContohTest {

    private static final Logger log = LoggerFactory.getLogger(ContohTest.class);

  @Test
  void testLoggerPackage() {

      log.error("Contoh");

  }
}
