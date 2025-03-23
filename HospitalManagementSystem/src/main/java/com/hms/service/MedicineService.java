package com.hms.service;

import java.util.List;
import java.util.Map;

import javax.management.AttributeNotFoundException;

import org.springframework.http.ResponseEntity;

import com.hms.doclogin.entity.Medicine;

public interface MedicineService {

	 Medicine addMedicine(Medicine medicine);
	 List<Medicine> getAllMedicine();
	 Medicine medicineGetById(long id) throws AttributeNotFoundException;
	 ResponseEntity<Map<String, Long>> deleteMedicine(long id) throws AttributeNotFoundException;
	 ResponseEntity<Map<String, Long>> updateById(long id, Medicine updateMedicine) throws AttributeNotFoundException;
	
	 
	
	
}
