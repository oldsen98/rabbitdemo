package com.sen.rabbitmq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * ClassName: ConsumerTest
 * Package: com.sen.rabbitmq
 * Description:
 *
 * @Author sen
 * @Create 2023-12-26 19:32
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-rabbitmq-consumer.xml")
public class ConsumerTest {

    @Test
    public void test(){
        while (true){

        }
    }
}
