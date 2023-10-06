package com.example.demo.entity;

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
@Table(name = "TRANSACTION_TYPE")
@Entity
public class TransactionTypeEntity {
	@Id
	@SequenceGenerator(name = "transactiontype_seq_gen", sequenceName = "transactiontype_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "TRANSACTION_ID")
	private Long transactionId;
	
	@Column(name = "TRANSACTION_EXPL")
	private String transactionExpl;
	
	@OneToOne(mappedBy = "transTypeEntity")
	private TransactionEntity transEntity;

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

	public TransactionEntity getTransEntity() {
		return transEntity;
	}

	public void setTransEntity(TransactionEntity transEntity) {
		this.transEntity = transEntity;
	}

	
}
