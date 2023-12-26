package com.sen.test;

import com.sen.config.RabbitMQConfig;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * ClassName: ProducerTest
 * Package: com.sen.rabbitmq
 * Description:
 *
 * @Author sen
 * @Create 2023-12-26 21:04
 * @Version 1.0
 */
@SpringBootTest
public class ProducerTest {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void test(){
        rabbitTemplate.convertAndSend(RabbitMQConfig.EXCHANGE_NAME,"boot.sen.sen","发送了一条boot消息！！");
    }
}
