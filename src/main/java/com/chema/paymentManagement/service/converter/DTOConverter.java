package com.chema.paymentManagement.service.converter;

import com.chema.paymentManagement.controller.dto.PaymentDTO;
import com.chema.paymentManagement.repository.entity.PaymentEntity;

public class DTOConverter {

    public PaymentEntity converter (PaymentDTO paymentDTO){
        PaymentEntity paymentEntity = new PaymentEntity();

        return paymentEntity;
    }
}
