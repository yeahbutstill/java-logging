package com.yeahbutstill;

import com.yeahbutstill.controller.MyController;
import com.yeahbutstill.repo.MyRepository;
import com.yeahbutstill.service.MyService;
import org.junit.jupiter.api.Test;
import org.slf4j.MDC;

import java.util.UUID;

public class MdcMultiThreadTest {

  @Test
  void testMdcMultiThread() throws InterruptedException {

      MyController myController = new MyController(new MyService(new MyRepository()));

      for (int i = 0; i < 10; i++) {
          String requestId = UUID.randomUUID().toString();
          new Thread(() -> {
              MDC.put("requestId", requestId);
              myController.save();
              MDC.remove("requestId");
          }).start();
      }

      Thread.sleep(1000L);

  }
}
