package com.chema.paymentManagement.service.converter;

import com.chema.paymentManagement.controller.dto.PaymentDTO;
import com.chema.paymentManagement.repository.entity.PaymentEntity;

import java.util.Date;
import java.util.UUID;

public class DTOConverter {

    public static PaymentEntity converter (PaymentDTO paymentDTO){
        PaymentEntity paymentEntity = new PaymentEntity();
        paymentEntity.setCreateDate(new Date().toString())
                .setPaymentTransactionID(UUID.randomUUID().toString())
                .setUserID(paymentDTO.getUserID())
                .setPaymentAmount(paymentDTO.getPaymentAmount());

        return paymentEntity;
    }
}
