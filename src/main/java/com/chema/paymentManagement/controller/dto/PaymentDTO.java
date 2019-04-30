package com.chema.paymentManagement.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDTO {

    private Long operationID; //Identifica la operación en la base de datos.
    private String userID;
    private String paymentTransactionID;
    private Boolean paymentStatus;
    private double paymentAmount;
}
