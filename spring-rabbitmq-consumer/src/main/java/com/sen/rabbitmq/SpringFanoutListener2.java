package com.sen.rabbitmq;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

import java.io.UnsupportedEncodingException;

/**
 * ClassName: SpringSimpleQueueListener2
 * Package: com.sen.rabbitmq
 * Description:
 *
 * @Author sen
 * @Create 2023-12-26 14:03
 * @Version 1.0
 */
public class SpringFanoutListener2 implements MessageListener {
    @Override
    public void onMessage(Message message) {
        try {
            String msg = new String(message.getBody(),"utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
