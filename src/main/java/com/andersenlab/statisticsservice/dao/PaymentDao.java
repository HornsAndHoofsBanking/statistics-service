package com.andersenlab.statisticsservice.dao;

import com.andersenlab.statisticsservice.domain.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentDao extends MongoRepository<Payment, Long> {
}
