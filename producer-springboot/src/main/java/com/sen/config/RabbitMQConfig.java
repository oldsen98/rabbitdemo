package com.sen.config;


import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: RabbitMQConfig
 * Package: com.sen.config
 * Description:
 *
 * @Author sen
 * @Create 2023-12-26 20:39
 * @Version 1.0
 */
@Configuration
public class RabbitMQConfig {

    public static final String EXCHANGE_NAME = "boot_topic_exchange";
    public static final String QUEUE_NAME = "boot_queue";

    @Bean("bootExchange")
    public Exchange bootExchange(){
        Exchange exchange = ExchangeBuilder.topicExchange(EXCHANGE_NAME).durable(true).build();
        return exchange;
    }

    @Bean("bootQueue")
    public Queue bootQueue(){
        Queue queue = QueueBuilder.durable(QUEUE_NAME).autoDelete().build();
        return queue;
    }

    @Bean
    public Binding bootBinding(@Qualifier("bootExchange") Exchange exchange,
                               @Qualifier("bootQueue") Queue queue){
        Binding binding = BindingBuilder.bind(queue).to(exchange).with("boot.#").noargs();
        return binding;
    }
}
