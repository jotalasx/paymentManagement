package com.chema.paymentManagement.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="payments")
public class PaymentEntity {

    @Id
    @GeneratedValue
    private Long operationID; //Identificador de cada fila de la base de datos.
    private String userID;
    private String paymentTransactionID; //Id del pago que se genera.
    private String createDate;
    private String updateDate;
    private Boolean paymentStatus;
    private double paymentAmount;

}
