package com.hms.service;

import java.util.List;
import java.util.Map;

import javax.management.AttributeNotFoundException;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.hms.entity.Patient;
@Service
public interface PatientService {
   
	Patient createPatient(Patient patient);
	List<Patient> getAllPatient();
	ResponseEntity< Map<String,Boolean>> deleteById(long pid) throws AttributeNotFoundException;
	Patient getPatientById(long pid) throws AttributeNotFoundException;
	
	
	
	
}
