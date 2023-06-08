package com.Payment.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Payment.main.entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer>
{
//	@Query("from Payment p where p.pId=:pId")
//	public Payment getPaymentBypId(@Param(value="pId")Integer pId);
//
//	
//	@Query("from Payment p where p.orderId=:orderId")
//	public Payment getPaymentByOrderId(@Param(value="orderId")Integer orderId);

	
}
