package com.andersenlab.statisticsservice.controller;

import com.andersenlab.statisticsservice.domain.Payment;
import com.andersenlab.statisticsservice.service.PersistenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Controller;

@Controller
public class PaymentListener {

    @Autowired
    private PersistenceService persistenceService;

    @KafkaListener(topics = "payment", groupId = "group_id", containerFactory = "kafkaListenerContainerFactory")
    public void paymentAction(Payment payment) {
        System.out.println("CONSUMED: " + payment);
        persistenceService.save(payment);
    }
}
