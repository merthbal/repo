package com.example.demo.dto;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
@Data
public class TransactionDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	Long transactionId;
	String transactionType;
	Long patientId;
	Date transactionDate;
	public Long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public Long getPatientId() {
		return patientId;
	}
	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
