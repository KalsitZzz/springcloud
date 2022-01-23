package com.yanxu.springcloud.dao;

import com.yanxu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

@Component
//@Mapper
//@MapperScan("com.yanxu.springcloud.dao") 与上面的@mapper等价
public interface PaymentDao {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
