package com.example.rabbitMqListener;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MyMessageListener {

    @RabbitListener(queues = ConsumerConfig.QUEUE_NAME)
    public void receiveMessage(MyMessage message) {
        System.out.println("Received message: " +message.getContent());

    }
}