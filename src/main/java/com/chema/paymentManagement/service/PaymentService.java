package com.chema.paymentManagement.service;

import com.chema.paymentManagement.controller.dto.PaymentDTO;

public interface PaymentService {

    // Metodo que va a generar un UUID para cada usuario que se reciba.
    PaymentDTO generatePayment(PaymentDTO paymentDTO);
}
