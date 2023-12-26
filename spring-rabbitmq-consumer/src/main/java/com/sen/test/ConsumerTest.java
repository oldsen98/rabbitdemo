package com.sen.test;

import com.sen.rabbitmq.SpringSimpleQueueListener;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * ClassName: ConsumerTest
 * Package: com.sen.test
 * Description:
 *
 * @Author sen
 * @Create 2023-12-26 13:19
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-rabbitmq.xml")
public class ConsumerTest {

    @Test
    public void test(){
        while (true){

        }
    }
}
