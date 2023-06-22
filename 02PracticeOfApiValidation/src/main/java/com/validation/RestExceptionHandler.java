//package com.validation;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.MethodArgumentNotValidException;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//import org.springframework.web.context.request.WebRequest;
//import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
//
//import jakarta.persistence.EntityNotFoundException;
//public class RestExceptionHandler extends ResponseEntityExceptionHandler {
//	    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
//	            ErrorModel error = new ErrorModel(HttpStatus.BAD_REQUEST, null, "Validation Error", ex.getBindingResult().toString());
//
//	            return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
//	    }
//
//	    @ExceptionHandler(EntityNotFoundException.class)
//	    private ResponseEntity<ErrorModel> handleEntityNotFound(EntityNotFoundException ex){
//	        ErrorModel error = new ErrorModel(HttpStatus.NOT_FOUND, null, "Entity not found", ex.getMessage());
//
//	        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
//	    }
//	}
