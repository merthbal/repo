package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "TRANSACTION")
@Entity
public class TransactionEntity {
	@Id
	@SequenceGenerator(name = "transaction_seq_gen", sequenceName = "transaction_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "TRANSACTION_ID")
	private Long transactionId;
	
	@Column(name = "TRANSACTION_TYPE")
	private String transactionType;
	
	@Column(name = "PATIENT_ID")
	private Long patientId;
	
	@Column(name = "TRANSACTION_DATE")
	private Date transactionDate;
	
	@OneToOne(mappedBy = "transEntity")
	private TransactionTypeEntity transTypeEntity;

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

	public TransactionTypeEntity getTransTypeEntity() {
		return transTypeEntity;
	}

	public void setTransTypeEntity(TransactionTypeEntity transTypeEntity) {
		this.transTypeEntity = transTypeEntity;
	}

	
}
