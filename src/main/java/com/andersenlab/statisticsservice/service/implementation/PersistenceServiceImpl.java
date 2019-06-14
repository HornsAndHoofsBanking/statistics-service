package com.andersenlab.statisticsservice.service.implementation;

import com.andersenlab.statisticsservice.dao.PaymentDao;
import com.andersenlab.statisticsservice.domain.Payment;
import com.andersenlab.statisticsservice.service.PersistenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersistenceServiceImpl implements PersistenceService {

    @Autowired
    private PaymentDao paymentDao;

    public void save(Payment payment){
        paymentDao.save(payment);
    }
}
