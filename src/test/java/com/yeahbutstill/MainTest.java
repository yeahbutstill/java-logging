package com.yeahbutstill;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainTest {

    /*
        kebanyakan orang disini dibuat private, karena dia hanya bisa diakses
        oleh class nya sendiri, lalu dibuat static karena nanti kalau ada static method yang lain
        biar bisa make si logger ini, lalu jadikan final biar tidak bisa diubah lagi.
     */
    private static final Logger log = LoggerFactory.getLogger(MainTest.class);


    @Test
    void testLog() {
        log.info("Hello Logger");
        log.info("Selamat Belajar Java Logging");
    }
    

}
