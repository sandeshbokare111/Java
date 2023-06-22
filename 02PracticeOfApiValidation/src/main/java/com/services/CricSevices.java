package com.services;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.zip.CRC32;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.entity.Cricketer;
import com.repository.CricRepository;

@Service
public class CricSevices {
	@Autowired
	CricRepository cRepo;
	
//	@ExceptionHandler(MethodArgumentNotValidException.class)
//	public Map<String, String> handler(MethodArgumentNotValidException ex) {
//	Map<String, String> errorMap = new HashMap<>();
//	
//	ex.getBindingResult().getFieldErrors().forEach(errors->{
//		errorMap.put(errors.getField(), errors.getDefaultMessage());
//	});
//	return errorMap;
//	}
	
	public Cricketer addCricketer(Cricketer cr) {
		return cRepo.save(cr);
	}

	public List<Cricketer> getAllCricketers() {
		List<Cricketer> list = (List<Cricketer>) cRepo.findAll();
		return list;
	}

	public Optional<Cricketer> getCricById(int id) {
		Optional<Cricketer> cr = cRepo.findById(id);
		return cr;
	}

	public Cricketer updateCricDetails(Cricketer cr, int id) {
		Optional<Cricketer> c1 = cRepo.findById(id);
		Cricketer pojo = new Cricketer();
		pojo = c1.get();
		pojo.setName(cr.getName());
		pojo.setDomesticRuns(cr.getDomesticRuns());
		pojo.setInternationalRuns(cr.getInternationalRuns());
		pojo.setJersyNo(cr.getJersyNo());
		return cRepo.save(pojo);
	}

	public Cricketer deleteCricketer(int id) {
		Cricketer c = cRepo.findById(id).get();
		cRepo.deleteById(id);
		return c;
	}
	
	//By using repository FindBy methods
	
	public List<Cricketer> findByDomesticRuns(int domRuns){
		List<Cricketer> c = cRepo.findByDomesticRuns(domRuns);
		return c;
	}
	
	
	
	public Cricketer findByJersyNum(int jersyNo) {
		Cricketer c = cRepo.findByJersyNo(jersyNo);
		return c;
	}
	
	public Cricketer findByNameAndJersyNo(String name, int jersyNo) {
		Cricketer c = cRepo.findByNameAndJersyNo(name, jersyNo);
		return c;
	}
	
	
	
}
