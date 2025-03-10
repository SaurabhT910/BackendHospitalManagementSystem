package com.hms.service;

import java.util.List;

import com.hms.doclogin.entity.Medicine;

public interface MedicineService {

	public Medicine addMedicine(Medicine medicine);
	public List<Medicine> getAllMedicine();
	
}
