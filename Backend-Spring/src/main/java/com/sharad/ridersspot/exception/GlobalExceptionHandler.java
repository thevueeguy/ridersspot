package com.sharad.ridersspot.exception;

import com.sharad.ridersspot.collection.ApiError;
import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{

    @Override
    protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex,
                                                                         HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        String message = ex.getMessage();
        HttpStatus httpStatus = HttpStatus.valueOf(status.value());
        String error = "Method not supported";
        ApiError apiErrors = new ApiError(message,httpStatus,LocalDateTime.now(),error,status.value());
        return ResponseEntity.status(status).headers(headers).body(apiErrors);
    }

    @Override
    protected ResponseEntity<Object> handleHttpMediaTypeNotSupported(HttpMediaTypeNotSupportedException ex,
                                                                     HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        String message = ex.getMessage();
        HttpStatus httpStatus = HttpStatus.valueOf(status.value());
        String error = "Media type not supported";
        ApiError apiErrors = new ApiError(message,httpStatus,LocalDateTime.now(),error,status.value());
        return ResponseEntity.status(status).headers(headers).body(apiErrors);
    }

    @Override
    protected ResponseEntity<Object> handleMissingPathVariable(MissingPathVariableException ex, HttpHeaders headers,
                                                               HttpStatusCode status, WebRequest request) {
        String message = ex.getMessage();
        HttpStatus httpStatus = HttpStatus.valueOf(status.value());
        String error = "Path variable is missing";
        ApiError apiErrors = new ApiError(message,httpStatus,LocalDateTime.now(),error,status.value());
        return ResponseEntity.status(status).headers(headers).body(apiErrors);
    }

    @Override
    protected ResponseEntity<Object> handleMissingServletRequestParameter(MissingServletRequestParameterException ex,
                                                                          HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        String message = ex.getMessage();
        HttpStatus httpStatus = HttpStatus.valueOf(status.value());
        String error = "Request parameter is missing";
        ApiError apiErrors = new ApiError(message,httpStatus,LocalDateTime.now(),error,status.value());
        return ResponseEntity.status(status).headers(headers).body(apiErrors);
    }

    @Override
    protected ResponseEntity<Object> handleTypeMismatch(TypeMismatchException ex, HttpHeaders headers,
                                                        HttpStatusCode status, WebRequest request) {
        String message = ex.getMessage();
        HttpStatus httpStatus = HttpStatus.valueOf(status.value());
        String error = "Type mismatch";
        ApiError apiErrors = new ApiError(message,httpStatus,LocalDateTime.now(),error,status.value());
        return ResponseEntity.status(status).headers(headers).body(apiErrors);
    }

    @ExceptionHandler(UserAlreadyExistsException.class)
    public ResponseEntity<Object> handleUserAlreadyExists(UserAlreadyExistsException ex, HttpHeaders headers,
                                                          HttpStatusCode status, WebRequest request) {
        String message = ex.getMessage();
        HttpStatus httpStatus = HttpStatus.valueOf(status.value());
        String error = "User already exists";
        ApiError apiErrors = new ApiError(message,httpStatus,LocalDateTime.now(),error,status.value());
        return ResponseEntity.status(status).headers(headers).body(apiErrors);
    }
}
