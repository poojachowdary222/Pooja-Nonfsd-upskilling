package com.Payment.main.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Payment.main.entity.Payment;
import com.Payment.main.exception.InvalidPaymentId;
import com.Payment.main.repository.PaymentRepository;

@Service

public class PaymentServiceImpl implements PaymentService{

	@Autowired
	PaymentRepository paymentRepository;

	public Payment insertPayment(Payment payment) throws Exception {
		return paymentRepository.save(payment);  // Note :  save() is already implemented by Spring Data JPA
		
	}
	 
	@Override
	public List<Payment> getAllPayments() throws Exception {
		
		return paymentRepository.findAll();
		}

	@Override
	public Payment updatePayment(Payment payment) throws Exception {
		// TODO Auto-generated method stub
		return paymentRepository.save(payment);
	}

	@Override

	public void deletePayment(int pId) throws InvalidPaymentId {
	paymentRepository.deleteById(pId);

	}

	 
}

	
	