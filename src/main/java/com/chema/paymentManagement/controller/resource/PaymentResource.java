package com.chema.paymentManagement.controller.resource;

import com.chema.paymentManagement.controller.dto.PaymentDTO;
import com.chema.paymentManagement.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentResource {

    @Autowired
    PaymentService paymentService;

    // Método que responde a la llamada del método
    @RequestMapping(path = "/payments", method = RequestMethod.POST)
    public ResponseEntity<PaymentDTO> createPayment(@RequestBody PaymentDTO paymentDTO){
        // Recibo el objeto, llamo al servicio para que haga algo con él
        // Genera el UUID, comprobará que no haya transacciones finalizas.
        // Siempre que me llamen, genero un ID de transaccion.
        ResponseEntity<PaymentDTO> response = null;
        PaymentDTO payment = paymentService.generatePayment(paymentDTO);
        if(payment != null){
             response = ResponseEntity.ok(payment);
        } else {
            response = ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        return response;

    }



}
