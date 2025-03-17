package com.hms.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.management.AttributeNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.entity.Patient;
import com.hms.repository.PatientRepository;
import com.hms.service.PatientService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/patients")
public class PatientsController implements PatientService {

	@Autowired
	private PatientRepository patientRepository;

	@Override
	@PostMapping("/add")
	public Patient createPatient(@RequestBody Patient patient) {
		return patientRepository.save(patient);
	}

	@Override
	@GetMapping("/all")
	public List<Patient> getAllPatient() {
		return patientRepository.findAll();
	}

	@Override
	@DeleteMapping("/delete/{pid}")
	public ResponseEntity<Map<String, Boolean>> deleteById(@PathVariable long pid) throws AttributeNotFoundException {
		Patient patients = patientRepository.findById(pid)
				.orElseThrow(() -> new AttributeNotFoundException("Patient Not Found In database"+pid));
		patientRepository.delete(patients);
		Map< String, Boolean> resonese=new HashMap<String, Boolean>();
		resonese.put("Succesfully Deleted", Boolean.TRUE);
		return ResponseEntity.ok(resonese);
	}

	@Override
	@GetMapping("{pid}")
	public Patient getPatientById(@PathVariable long pid) throws AttributeNotFoundException {
		Patient patients = patientRepository.findById(pid)
				.orElseThrow(() -> new AttributeNotFoundException("Patient Not Found In database"+pid));
		return patients;
	}

	

	
	
	

}
