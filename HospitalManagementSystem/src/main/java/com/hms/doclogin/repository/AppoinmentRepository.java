package com.hms.doclogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hms.doclogin.entity.Appointment;

public interface AppoinmentRepository extends JpaRepository<Appointment, Long>{

}
