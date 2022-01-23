package com.yanxu.springcloud.service.impl;

import com.yanxu.springcloud.dao.PaymentDao;
import com.yanxu.springcloud.entities.Payment;
import com.yanxu.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PaymentServiceImpl implements PaymentService {
    @Autowired //@Resource 这两个都可以注入，区别是
            /*
            * @Autowired 由spring提供，注入规则：先byType，后byName
            *
            * @Resource 由JDK提供，注入规则：先byName，后byType
            * */
    PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
