package com.example.springbootdemo.rabbitMq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitConfig {
    @Bean
    public Queue Queue(){
        return new Queue("helloZyy");
    }
}
