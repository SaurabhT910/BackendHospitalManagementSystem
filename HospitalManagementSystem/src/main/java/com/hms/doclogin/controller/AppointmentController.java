package com.hms.doclogin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.doclogin.entity.Appointment;
import com.hms.doclogin.repository.AppoinmentRepository;
import com.hms.service.AppointmentService;

@RestController
@RequestMapping("/api/v2")
public class AppointmentController implements AppointmentService {

	@Autowired
	private AppoinmentRepository appoinmentRepository;
	@Override
	@PostMapping("/add/appo")
	public Appointment createAppoinment(@RequestBody Appointment appointment) {

		return appoinmentRepository.save(appointment);
	}
	@Override
	@GetMapping("getAll")
	public List<Appointment> getAllAppointment() {
		
		return appoinmentRepository.findAll();
	}
}
