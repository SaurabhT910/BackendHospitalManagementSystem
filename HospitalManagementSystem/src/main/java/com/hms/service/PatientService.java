package com.hms.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.hms.entity.Patient;
@CrossOrigin(origins ="http://localhost:4200")
@Service
public interface PatientService {
   
	public Patient createPatient(Patient patient);
	public List<Patient> getAllPatient();
	
}
