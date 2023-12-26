package com.sen.rabbitmq;

import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.amqp.rabbit.listener.api.ChannelAwareMessageListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * ClassName: AckListener
 * Package: com.sen.rabbitmq
 * Description:
 *
 * @Author sen
 * @Create 2023-12-26 19:19
 * @Version 1.0
 */
@Component
public class AckListener implements ChannelAwareMessageListener {

    @Override
    public void onMessage(Message message, Channel channel) throws Exception {
        long deliveryTag = message.getMessageProperties().getDeliveryTag();

        try {
            System.out.println("msg = " + new String(message.getBody(),"utf-8"));
            // int i = 1 / 0;
            channel.basicAck(deliveryTag,true);
        } catch (IOException e) {
            e.printStackTrace();
            channel.basicNack(deliveryTag,true,true);
        }

    }
}
