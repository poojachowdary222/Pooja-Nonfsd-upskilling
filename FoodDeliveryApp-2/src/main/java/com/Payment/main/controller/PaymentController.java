package com.Payment.main.controller;

import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.Payment.main.entity.Payment;
import com.Payment.main.service.PaymentService;

@RestController  
//@RequestMapping("/payment")
public class PaymentController {

    private static final Logger logger = LoggerFactory.getLogger(PaymentController.class);

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/addPayment")
    public Payment insertPayment(@RequestBody Payment payment) {
        try {
            logger.info("Inserting payment: {}", payment);
            return paymentService.insertPayment(payment);
        } catch (Exception e) {
            logger.error("Failed to insert payment", e);
        }
        return payment;
    }

    @DeleteMapping("/deletePayment/{pId}")
    public String deletePayment(@PathVariable int pId) throws Exception {
        try {
            logger.info("Deleting payment with ID: {}", pId);
            paymentService.deletePayment(pId);
        } catch (Exception e) {
            logger.error("Failed to delete payment with ID: {}", pId, e);
        }
        return "Deleted Id = " + pId + " Data";
    }

    @PutMapping("/updatePayment")
    public Payment updatePayment(@RequestBody Payment payment) throws Exception {
        try {
            logger.info("Updating payment: {}", payment);
            return paymentService.updatePayment(payment);
        } catch (Exception e) {
            logger.error("Failed to update payment", e);
        }
        return payment;
    }

    @GetMapping("/allPayments")
    public List<Payment> getAllPayments() throws Exception {
        try {
            logger.info("Retrieving all payments");
            return paymentService.getAllPayments();
        } catch (Exception e) {
            logger.error("Failed to retrieve all payments", e);
        }
        return Collections.emptyList();
    }
}
