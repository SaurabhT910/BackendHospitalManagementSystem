package com.hms.service;

import org.springframework.stereotype.Service;

import com.hms.entity.Patient;
@Service
public interface PatientService {
   
	public Patient createPatient(Patient patient);
}
