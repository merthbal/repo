package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import com.example.demo.dto.EntityConverter;
import com.example.demo.dto.PatientDTO;
import com.example.demo.entity.PatientEntity;
import com.example.demo.repository.PatientRepository;


@Service
@Configurable
public class PatientService {
	
	@Autowired
	private static PatientRepository patientRepository;
	
	public PatientDTO getPatientById(Long patientId) {
		PatientEntity ent = patientRepository.findById(patientId).orElse(new PatientEntity());
		return EntityConverter.convertPatientToDto(ent);
	}
	
	public PatientDTO save(PatientDTO dto) {
		PatientEntity savedEntity = patientRepository.save(EntityConverter.convertDtoToEntity(dto));
		return EntityConverter.convertPatientToDto(savedEntity);
    }
    
    public PatientEntity getPatientTcId(Long patientId) {
		return patientRepository.findByTcId(patientId);
	}
    
}
