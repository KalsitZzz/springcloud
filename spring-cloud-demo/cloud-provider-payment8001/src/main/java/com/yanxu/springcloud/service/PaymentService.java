package com.yanxu.springcloud.service;

import com.yanxu.springcloud.entities.Payment;


public interface PaymentService {
    public int create(Payment payment); //写
    public Payment getPaymentById(Long id);  //读取
}
