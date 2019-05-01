package com.chema.paymentManagement.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class PaymentDTO {

    private Long operationID; //Identifica la operación en la base de datos.
    private String userID;
    private String paymentTransactionID;
    private Boolean paymentStatus;
    private double paymentAmount;
}
