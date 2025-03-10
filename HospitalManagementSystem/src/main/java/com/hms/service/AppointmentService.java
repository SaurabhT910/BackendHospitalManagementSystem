package com.hms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hms.doclogin.entity.Appointment;

@Service
public interface AppointmentService {

	public Appointment createAppoinment(Appointment appointment);
	public List<Appointment> getAllAppointment();
}
