package com.hms.service;

import org.springframework.stereotype.Service;

import com.hms.doclogin.entity.Appointment;

@Service
public interface AppointmentService {

	public Appointment createAppoinment(Appointment appointment);
}
