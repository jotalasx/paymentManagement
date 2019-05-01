package com.chema.paymentManagement.service.impl;

import com.chema.paymentManagement.controller.dto.PaymentDTO;
import com.chema.paymentManagement.repository.PaymentRepository;
import com.chema.paymentManagement.repository.entity.PaymentEntity;
import com.chema.paymentManagement.service.PaymentService;
import com.chema.paymentManagement.service.converter.DTOConverter;
import com.chema.paymentManagement.service.converter.EntityConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    PaymentRepository paymentRepository;
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
        //paymentDTO.setPaymentTransactionID(UUID.randomUUID().toString());
        // Ahora lo transformamos en una Entity
        PaymentDTO generatedPayment = null;
        // Sacamos el entity, lo llevamos al Repository y de ahí a la base de datos.
        PaymentEntity paymentEntity =  DTOConverter.converter(paymentDTO);
        // Este método guarda un objeto y lo envia a la base de datos.
        paymentEntity = paymentRepository.save(paymentEntity);

        generatedPayment = EntityConverter.converter(paymentEntity);

        return generatedPayment;
    }
}
