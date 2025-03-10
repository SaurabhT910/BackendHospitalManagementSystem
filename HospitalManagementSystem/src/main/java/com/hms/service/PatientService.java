package com.hms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hms.entity.Patient;
@Service
public interface PatientService {
   
	public Patient createPatient(Patient patient);
	public List<Patient> getAllPatient();
	
}
