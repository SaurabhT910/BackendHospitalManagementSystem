package com.hms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.entity.Patient;
import com.hms.repository.PatientRepository;
import com.hms.service.PatientService;

@RestController
@RequestMapping("/api/v1")
public class PatientsController implements PatientService {
	
	@Autowired
	private PatientRepository patientRepository;

	@Override
	@PostMapping("/add")
	public Patient createPatient(@RequestBody Patient patient) {	
		return patientRepository.save(patient);
	}

	@Override
	@GetMapping("/getAll")
	public List<Patient> getAllPatient(){
		return patientRepository.findAll();		
	}

	

}
