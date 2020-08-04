package com.qby.springboot;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBoot03LoggingApplicationTests {

    @Test
    void contextLoads() {
        Logger logger = LoggerFactory.getLogger(this.getClass());
        // 日子级别由低到高 trace < debug < info < warn < error
        logger.trace("这是 trace.....");
        logger.debug("这是 debug.....");
        // springboot 默认是INFO级别 没有指定级别的就用springboot默认规定级别，root级别
        logger.info("这是 info.....");
        logger.warn("这是 warn.....");
        logger.error("这是 error.....");
    }

}
