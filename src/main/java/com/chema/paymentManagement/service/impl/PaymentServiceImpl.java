package com.chema.paymentManagement.service.impl;

import com.chema.paymentManagement.controller.dto.PaymentDTO;
import com.chema.paymentManagement.service.PaymentService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    public PaymentDTO generatePayment(PaymentDTO paymentDTO) {
        // Generamos un entity en base al DTO que nos llega
        // y ese entity lo almacenaremos en la base de datos.
        // Tendremos que crear un id de transaccion, ya que solo nos
        // va a llegar el id de usuario. Además de hacer una fecha de creación.
        // (Al devolvernos los datos).
        // Dentro del DTO ya está la ID del usuario, generamos un id trans, le metemos la fecha
        // genermaos la entity, la mandamos, y nos vuelve la entity con la id generada en
        // la base de datos, lo convertimos en un dto y lo mandamos de vuelta.

        // Con esto metemos en el DTO la fecha y el UUID.
        paymentDTO.setPaymentTransactionID(UUID.randomUUID().toString());
        // Ahora lo transformamos en una Entity


        return null;
    }
}
