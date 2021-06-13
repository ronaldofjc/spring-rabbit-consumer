package br.com.rabbit.service;

import br.com.rabbit.entity.Book;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class JsonConsumer {

    private final MessageConverter converter;

    @RabbitListener(queues = "JSON-QUEUE", containerFactory="jsaFactory")
    void receiveMessageFromJsonQueue(Message message) {
        log.info("Receive message from {}", message.getMessageProperties().getConsumerQueue());
        Book book = (Book) converter.fromMessage(message);
        log.info("Body {}", book);
    }

}
