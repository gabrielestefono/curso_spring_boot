package com.calculadora.errors.manager;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.calculadora.errors.error.BadRequest;
import com.calculadora.errors.messages.ErrorResponse;

@RestControllerAdvice
public class ExceptionHandlerGlobal extends ResponseEntityExceptionHandler{
	@ExceptionHandler(BadRequest.class)
	protected ResponseEntity<Object> handleCustomException(BadRequest ex, WebRequest request) {
		ErrorResponse errorResponse = new ErrorResponse(ex.getMessage(), HttpStatus.BAD_REQUEST.value());
		return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
	}
}
