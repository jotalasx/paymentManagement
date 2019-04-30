package com.chema.paymentManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository {
    // El "save" ya está implementado dentro del JpaRepo-
}

