package com.example.demo.dto;

import java.io.Serializable;
import lombok.Data;
@Data
public class TransactionTypeDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	Long transactionId;
	String transactionExpl;
	
	public Long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}
	public String getTransactionExpl() {
		return transactionExpl;
	}
	public void setTransactionExpl(String transactionExpl) {
		this.transactionExpl = transactionExpl;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
