package com.sen.rabbitmq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * ClassName: ProducerTest
 * Package: com.sen.rabbitmq
 * Description:
 *
 * @Author sen
 * @Create 2023-12-26 12:01
 * @Version 1.0
 */

// @RunWith(SpringJUnit4ClassRunner.class)
@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:spring/spring-rabbitmq.xml")
public class ProducerTest {

    @Resource
    private RabbitTemplate rabbitTemplate;

    @Test
    public void test(){
        rabbitTemplate.convertAndSend("spring_topic_exchange", "sensen.bj", "发送到spring_topic_exchange交换机sensen.bj的消息");
        rabbitTemplate.convertAndSend("spring_topic_exchange", "sensen.bj.1", "发送到spring_topic_exchange交换机sensen.bj.1的消息");
        rabbitTemplate.convertAndSend("spring_topic_exchange", "sensen.bj.2", "发送到spring_topic_exchange交换机sensen.bj.2的消息");
        rabbitTemplate.convertAndSend("spring_topic_exchange", "sen.cn", "发送到spring_topic_exchange交换机sen.cn的消息");
    }
}
