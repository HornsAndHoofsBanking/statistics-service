package com.andersenlab.statisticsservice.service;

import com.andersenlab.statisticsservice.domain.Payment;

public interface PersistenceService {

    void save(Payment payment);
}
