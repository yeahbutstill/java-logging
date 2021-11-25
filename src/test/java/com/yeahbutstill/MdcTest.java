package com.yeahbutstill;

import com.yeahbutstill.controller.MyController;
import com.yeahbutstill.repo.MyRepository;
import com.yeahbutstill.service.MyService;
import org.junit.jupiter.api.Test;
import org.slf4j.MDC;

import java.util.UUID;

public class MdcTest {

  @Test
  void testRequestId() {

      String requestId = UUID.randomUUID().toString();

      MyController myController = new MyController(new MyService(new MyRepository()));

    // Menggunakan MDC
    MDC.put("requestId", requestId);
    myController.save();
    // Setelah selesai di remove
      MDC.remove("requestId");

  }
}
