package com.sen.rabbitmq;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

import java.io.UnsupportedEncodingException;

/**
 * ClassName: SpringSimpleQueueListener
 * Package: com.sen.rabbitmq
 * Description:
 *
 * @Author sen
 * @Create 2023-12-26 13:03
 * @Version 1.0
 */
public class SpringSimpleQueueListener implements MessageListener {

    @Override
    public void onMessage(Message message) {

        try {
            byte[] messageBody = message.getBody();
            String msg = new String(messageBody, "utf-8");
            System.out.println("msg = " + msg);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }
}
