package com.chema.paymentManagement.service.converter;

import com.chema.paymentManagement.controller.dto.PaymentDTO;
import com.chema.paymentManagement.repository.entity.PaymentEntity;

public class EntityConverter {

    public static PaymentDTO converter (PaymentEntity entity){
        PaymentDTO paymentDTO = new PaymentDTO();
        paymentDTO.setOperationID(entity.getOperationID())
                .setUserID(entity.getUserID())
                .setPaymentTransactionID(entity.getPaymentTransactionID())
                .setPaymentAmount(entity.getPaymentAmount())
                .setPaymentStatus(entity.getPaymentStatus());

        return paymentDTO;
    }
}
