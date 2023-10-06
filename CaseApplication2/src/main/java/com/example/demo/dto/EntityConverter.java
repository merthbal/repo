package com.example.demo.dto;

import com.example.demo.entity.PatientEntity;
import com.example.demo.entity.ReportsEntity;
import com.example.demo.entity.TransactionEntity;
import com.example.demo.entity.TransactionTypeEntity;

public class EntityConverter {
	
		public static PatientDTO convertPatientToDto(PatientEntity patientEntity) {
			PatientDTO patientDTO = new PatientDTO();
		    patientDTO.setTcId(patientEntity.getTcId());
		    patientDTO.setPatientId(patientEntity.getPatientId());
		    patientDTO.setName(patientEntity.getName());
		    patientDTO.setMiddleName(patientEntity.getMiddleName());
		    patientDTO.setSurname(patientEntity.getSurname());
		    patientDTO.setBirthDate(patientEntity.getBirthDate());
		    patientDTO.setSex(patientEntity.getSex());
		    patientDTO.setAge(patientEntity.getAge());
		    System.out.println(patientDTO);
		    return patientDTO;
		}
		
		public static PatientEntity convertDtoToEntity(PatientDTO patientDTO) {
			PatientEntity patientEntity = new PatientEntity();
			patientEntity.setTcId(patientDTO.getTcId());
			patientEntity.setPatientId(patientDTO.getPatientId());
			patientEntity.setName(patientDTO.getName());
			patientEntity.setMiddleName(patientDTO.getMiddleName());
			patientEntity.setSurname(patientDTO.getSurname());
			patientEntity.setBirthDate(patientDTO.getBirthDate());
			patientEntity.setSex(patientDTO.getSex());
			patientEntity.setAge(patientDTO.getAge());
		    System.out.println(patientDTO);
		    return patientEntity;
		}
		
		
		
		
		public static ReportsDTO convertReportsToDto(ReportsEntity reportsEntity) {
			ReportsDTO reportsDTO = new ReportsDTO();
		    reportsDTO.setPatientId(reportsEntity.getPatientId());
		    reportsDTO.setReport(reportsEntity.getReport());
		    reportsDTO.setReportText(reportsEntity.getReportText());
		    System.out.println(reportsDTO);

		    return reportsDTO;
		}
		public static TransactionDTO convertTransactionToDto(TransactionEntity transactionEntity) {
		    TransactionDTO transactionDTO = new TransactionDTO();
		    transactionDTO.setTransactionId(transactionEntity.getTransactionId());
		    transactionDTO.setTransactionType(transactionEntity.getTransactionType());
		    transactionDTO.setPatientId(transactionEntity.getPatientId());
		    transactionDTO.setTransactionDate(transactionEntity.getTransactionDate());
		    System.out.println(transactionDTO);

		    return transactionDTO;
		}
		public static TransactionTypeDTO convertTransactionTypeToDto(TransactionTypeEntity transactionTypeEntity) {
			TransactionTypeDTO transactionTypeDTO = new TransactionTypeDTO();
			transactionTypeDTO.setTransactionId(transactionTypeEntity.getTransactionId());
			transactionTypeDTO.setTransactionExpl(transactionTypeEntity.getTransactionExpl());
		    System.out.println(transactionTypeDTO);

		    return transactionTypeDTO;
		}

	}




//public static ReportsDTO EntityToDto(ReportsEntity reportsEntity) {
//
//ReportsDTO dto = new ReportsDTO();
//
//if(ReportsEntity.getName()==null) {
//dto.setName(ReportsEntity.getName());
//}
//if(ReportsEntity.getSurname()==null) {
//dto.setSurname(ReportsEntity.getSurname());
//}
//return dto;
//}