package com.Payment.main.entity;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import com.Payment.main.entity.Payment;



@Entity
@Table(name = "Payment")

public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int pId;
	private int orderId;
	private	float totalAmount;
	private String status;
	
	
	 
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
 


	public Payment(int pId,int orderId,float totalAmount,String status) {
		super();
		this.pId = pId;
		this.orderId = orderId;
		this.totalAmount = totalAmount;
		this.status = status;
		
		
		
}
	
	public int getpId() {
		return pId;
	}



	public void setpId(int pId) {
		this.pId = pId;
	}



	public int getOrderId() {
		return orderId;
	}



	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public float getTotalAmount() {
		return totalAmount;
	}


	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}



	public String getStatus() {
		return status;
	}  



	public void setStatus(String status) {
		this.status = status;
	}



	@Override
	public String toString() {
		return "Payment [pId=" + pId + ", orderId=" + orderId + ", totalAmount=" + totalAmount + ", status="
				+ status + "]"; 
	}
	
	
}

