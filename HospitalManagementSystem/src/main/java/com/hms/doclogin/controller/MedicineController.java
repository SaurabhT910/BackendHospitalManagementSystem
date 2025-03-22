package com.hms.doclogin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.doclogin.entity.Medicine;
import com.hms.doclogin.repository.MedicineRepository;
import com.hms.service.MedicineService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v3/medicine")
public class MedicineController implements MedicineService {
	@Autowired
	private MedicineRepository medicineRepository;
	@Override
	@PostMapping("/add")
	public Medicine addMedicine(@RequestBody Medicine medicine) {
		return medicineRepository.save(medicine);
	}
	@Override
	@GetMapping("/all")
	public List<Medicine> getAllMedicine() {
		return medicineRepository.findAll();
	}
	
}
