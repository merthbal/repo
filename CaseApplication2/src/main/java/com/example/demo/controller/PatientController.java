package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dto.PatientDTO;
import com.example.demo.service.PatientService;

@RestController
@RequestMapping("/patientApi")
public class PatientController {
	
	@Autowired
	private static PatientService patientService;
	

    @GetMapping("/{	}")
    public PatientDTO getPatient(@PathVariable Long patientId) {
		return patientService == null ? new PatientDTO() : patientService.getPatientById(patientId);
    }

	@PostMapping("/save")
	public PatientDTO savePatient(@RequestBody PatientDTO dto) {
		return patientService.save(dto);
	}
	
}
