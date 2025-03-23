package com.hms.doclogin.controller;

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
import org.springframework.web.bind.annotation.PutMapping;
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

	@GetMapping("{id}")
	@Override
	public Medicine medicineGetById(@PathVariable long id) throws AttributeNotFoundException {
		Medicine medicine = medicineRepository.findById(id)
				.orElseThrow(() -> new AttributeNotFoundException("Medicine Not Found In database"));
		return medicine;
	}

	@DeleteMapping("/delete/{id}")
	@Override
	public ResponseEntity<Map<String, Long>> deleteMedicine(@PathVariable long id) throws AttributeNotFoundException {
		Medicine medicine = medicineRepository.findById(id)
				.orElseThrow(() -> new AttributeNotFoundException("Medicine Not Found In Database"));
		medicineRepository.delete(medicine);
		Map<String, Long> responce = new HashMap<>();
		responce.put("Deletede Successfully", id);
		return ResponseEntity.ok(responce);
	}

	@PutMapping("/update/{id}")
	@Override
	public ResponseEntity<Map<String, Long>> updateById(@PathVariable long id,@RequestBody Medicine updateMedicine) throws AttributeNotFoundException {
		Medicine medicine = medicineRepository.findById(id)
				.orElseThrow(() -> new AttributeNotFoundException("Medicine not found in database"));
         medicine.setDrugName(updateMedicine.getDrugName());
         medicine.setStock(updateMedicine.getStock());
         Map<String,Long> responce=new HashMap<String, Long>();
         medicineRepository.save(medicine);
         responce.put("Updated Successfully",id);
		return ResponseEntity.ok(responce);
	}

}
