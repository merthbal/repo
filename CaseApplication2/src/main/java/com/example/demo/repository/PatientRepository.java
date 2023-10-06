package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.demo.entity.PatientEntity;

@EnableJpaRepositories
public interface PatientRepository extends JpaRepository<PatientEntity, Long>{
	
	PatientEntity findByTcId(Long tcId);
	
}
