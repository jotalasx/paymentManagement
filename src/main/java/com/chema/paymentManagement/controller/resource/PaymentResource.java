package com.chema.paymentManagement.controller.resource;

import com.chema.paymentManagement.controller.dto.PaymentDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentResource {

    // Método que responde a la llamada del método
    public void createPayment(@RequestBody PaymentDTO paymentDTO){
        //Recibo el objeto, llamo al servicio para que haga algo con él
        // Genera el UUID, comprobará que no haya transacciones finalizas.
        //Siempre que me llamen, genero un ID de transaccion.

    }



}
