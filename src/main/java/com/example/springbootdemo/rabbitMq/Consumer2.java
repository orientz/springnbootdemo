package com.example.springbootdemo.rabbitMq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "helloZyy")
public class Consumer2 {
    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver2  : " + hello);
    }
}
