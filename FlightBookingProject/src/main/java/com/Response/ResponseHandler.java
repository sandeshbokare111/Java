package com.Response;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.repository.FlightRepository;

public class ResponseHandler {
	@Autowired
	FlightRepository fRepo;
	public static ResponseEntity<Object> responseBuilder(String message, HttpStatus httpstatus, Object responseObject)
	{
		Map<String,Object> response= new HashMap<>();
		response.put("message", message);
		response.put("httpStatus", httpstatus);
		response.put("data", responseObject);
//		response.put("code", HttpStatus.values());
		return new ResponseEntity<>(response,httpstatus);
	}


}
