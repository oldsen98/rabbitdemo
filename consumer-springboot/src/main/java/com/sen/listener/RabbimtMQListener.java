package com.sen.listener;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;

/**
 * ClassName: RabbimtMQListener
 * Package: com.sen.listener
 * Description:
 *
 * @Author sen
 * @Create 2023-12-26 21:18
 * @Version 1.0
 */
@Component
public class RabbimtMQListener {

    @RabbitListener(queues = "boot_queue")
    public void listenerQueue(Message message){
        try {
            byte[] messageBody = message.getBody();
            String msg = new String(messageBody, "utf-8");
            System.out.println("msg = " + msg);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
