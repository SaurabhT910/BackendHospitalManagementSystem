package com.hms.service;

import java.util.List;
import java.util.Map;

import javax.management.AttributeNotFoundException;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.hms.doclogin.entity.Appointment;

@CrossOrigin(origins ="http://localhost:4200")
@Service
public interface AppointmentService {

	public Appointment createAppoinment(Appointment appointment);
	public List<Appointment> getAllAppointment();
	public ResponseEntity<Map<String, Boolean>> deleteById(long id) throws AttributeNotFoundException;
	public ResponseEntity<Map<String,Long>> updateById(long id) throws AttributeNotFoundException;
	ResponseEntity<Map<String, Long>> updateById(long id, Appointment updateAppointment) throws AttributeNotFoundException;
	
}
