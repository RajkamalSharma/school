package com.ons.school.web.application.exception.exceptionHandler;

import com.ons.school.web.application.exception.ErrorDetails;
import com.ons.school.web.application.exception.user.UsernotfoundException;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class SchoolExceptionHandler {

    @ExceptionHandler(UsernotfoundException.class)
    public final ResponseEntity<ErrorDetails> handleUserNotFoundException(UsernotfoundException ex, WebRequest request) {
        ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(),
                request.getDescription(false));
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorDetails> handleException(MethodArgumentNotValidException exception) {

        String errorMsg = exception.getBindingResult().getFieldErrors().stream()
                .map(DefaultMessageSourceResolvable::getDefaultMessage)
                .findFirst()
                .orElse(exception.getMessage());

        ErrorDetails error =  new ErrorDetails(new Date(), "Invalid Inputs",
                errorMsg);

        return  new ResponseEntity<>(error, HttpStatus.BAD_REQUEST) ;
    }

}
