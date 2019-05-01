package com.chema.paymentManagement.repository;

import com.chema.paymentManagement.repository.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<PaymentEntity, Long> {
    // El "save" ya está implementado dentro del JpaRepo-

}

