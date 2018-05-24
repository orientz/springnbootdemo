package com.example.springbootdemo.test;

import com.example.springbootdemo.rabbitMq.Producer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMqTest {

    @Autowired
    private Producer producer;

    @Test
    public void hello() throws Exception {
        producer.send();
    }

}
