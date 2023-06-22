package com.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Cricketer;
import com.repository.CricRepository;
import com.services.CricSevices;
import com.validation.ErrorModel;

import jakarta.validation.Valid;
import jakarta.validation.ValidationException;

@RestController
@RequestMapping("/api")
public class CricController {

	@Autowired
	CricSevices csr;
	
	@Autowired
	CricRepository crp;
	
//	@ExceptionHandler(MethodArgumentNotValidException.class)
//	public Map<String, String> handler(MethodArgumentNotValidException ex) {
//	Map<String, String> errorMap = new HashMap<>();
//	
//	ex.getBindingResult().getFieldErrors().forEach(errors->{
//		errorMap.put(errors.getField(), errors.getDefaultMessage());
//	});
//	return errorMap;
//	}
	
	
	
	
	
	
	
	@PostMapping("/cricketer")
	public Cricketer insertCricketer(@RequestBody @Valid Cricketer cr) {
		if(cr.getId()==0 && cr.getName()!= null && cr.getJersyNo()!=0) {
		return crp.save(cr);
	}else {
		throw new ValidationException("Cricketer cant be added");
		}
	}
	
//	@ExceptionHandler(ValidationException.class)
//	ResponseEntity<String> excpetionHandler(ValidationException v){
//		return new ResponseEntity(v.getMessage(),HttpStatus.BAD_REQUEST);
//	}
//	
	
	
	@ExceptionHandler
	@ResponseStatus(code= HttpStatus.BAD_REQUEST)
	ErrorModel exceptionHandler(ValidationException e) {
		return new ErrorModel("400",e.getMessage());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@GetMapping("/cricketers")
	public ResponseEntity<List<Cricketer>> findAllCricketers(){
		List<Cricketer> s = csr.getAllCricketers();
		return new ResponseEntity<List<Cricketer>>(s,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/cricketer/{id}")
	public ResponseEntity<Cricketer> getCricketer(@PathVariable ("id") int id) {
		Cricketer s = csr.getCricById(id).get();
		return ResponseEntity.ok().body(s);		
	}
	
	
	
	
	
	
	
	
	@PutMapping("/cricketer/{id}")
	public ResponseEntity<Cricketer> updateCric(@RequestBody Cricketer c1, @PathVariable ("id") int id) {
		Cricketer c = csr.updateCricDetails(c1, id);
		if (crp.findById(c1.getId()).isPresent()) {
			return new ResponseEntity<Cricketer>(c,HttpStatus.OK);
		}else {
			return new ResponseEntity<Cricketer>(c1,HttpStatus.BAD_REQUEST);
		}
		
//		return ResponseEntity.accepted().body(c);
	}
	
	
	
	
	
	
	
	
	
	
	
	@DeleteMapping("/cricketer/{id}")
	public Cricketer deleteCric(@PathVariable("id") int id) {
		return csr.deleteCricketer(id);		
	}
	
	@GetMapping("/cricketers/{domRuns}")
	public List<Cricketer> findByDomRuns(@PathVariable("domRuns") int domRuns){
		return csr.findByDomesticRuns(domRuns);	
	}
	
	@GetMapping("/cricketer/{jersyNo}")
	public Cricketer findByJersyNo(@PathVariable ("jersyNo") int jersyNo) {
		return csr.findByJersyNum(jersyNo);	
	}
	
	@GetMapping("/cricketer/{name}/{jersyNo}")
	public Cricketer findByNameAndJersy(@PathVariable("name") String name,@PathVariable("jersyNo") int jersyNo) {
		return csr.findByNameAndJersyNo(name,jersyNo);
	}
	
//	@GetMapping("/cricketer/{name}/{jersyNo}")
//	public Cricketer findByNameOrJersy(@PathVariable(value="name",required = false) String name,@PathVariable("jersyNo",required = false) int jersyNo) {
//		return csr.findByNameOrJersyNo(name,jersyNo);
//	}
}