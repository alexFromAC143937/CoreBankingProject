package com.bank.coresystem.controller;

import com.bank.coresystem.dto.ErrorResponse;
import com.bank.coresystem.dto.ExceptionBaseStructure;
import com.bank.coresystem.exception.ElementNotFindException;
import com.bank.coresystem.exception.ErrorCode;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
public class ResponseExceptionHandler extends ResponseEntityExceptionHandler {
    /* there isn't information in DB*/
    @ExceptionHandler(ElementNotFindException.class)
    public ResponseEntity<ExceptionBaseStructure> handleElementNotFindException(Exception exception) {
        return new ResponseEntity<>(new ExceptionBaseStructure(exception.getMessage(),ErrorCode.ROW_NOT_FOUND
            ), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    protected ResponseEntity<Object> handleIllegalArgumentException(IllegalArgumentException exception){
        return new ResponseEntity<>(new ExceptionBaseStructure(ErrorCode.VALIDATION_FAILED, exception.getMessage()
            ) , HttpStatus.BAD_REQUEST);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex,
            HttpHeaders headers,
            HttpStatusCode status,
            WebRequest request
    ) {
        List<ExceptionBaseStructure> exceptionBaseStructures = ex.getFieldErrors()
                .stream()
                .map(filedError -> new ExceptionBaseStructure(filedError.getDefaultMessage(),
                        String.format("invalid_%s", filedError.getField())))
                .collect(Collectors.toList());
        return new ResponseEntity<>(
                new ErrorResponse(ErrorCode.INVALID_VALIDATION_INPUT, exceptionBaseStructures) , HttpStatus.BAD_REQUEST);
    }
}