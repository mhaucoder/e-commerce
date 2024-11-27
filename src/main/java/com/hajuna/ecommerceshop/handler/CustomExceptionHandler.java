package com.hajuna.ecommerceshop.handler;

import com.hajuna.ecommerceshop.common.ErrorResponse;
import com.hajuna.ecommerceshop.enums.ResponseStatus;
import com.hajuna.ecommerceshop.exception.AlreadyExistsException;
import com.hajuna.ecommerceshop.exception.NotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.server.ResponseStatusException;

import java.util.Objects;

@ControllerAdvice
@RequiredArgsConstructor
public class CustomExceptionHandler {
    private final HttpServletRequest request;

    // Handler Exception Validation
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handleValidationExceptions(MethodArgumentNotValidException ex) {
        ErrorResponse errorResponse = ErrorResponse.builder()
                .code(ResponseStatus.BAD_REQUEST.getCode())
                .status(ResponseStatus.BAD_REQUEST.getStatus())
                .message(Objects.requireNonNull(ex.getBindingResult().getFieldError()).getDefaultMessage())
                .path(request.getRequestURI()).build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
    }

    // Handler Not Found Exception
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<ErrorResponse> handleNotFoundException(NotFoundException ex) {
        ErrorResponse errorResponse = ErrorResponse.builder()
                .code(ResponseStatus.NOT_FOUND.getCode())
                .status(ResponseStatus.NOT_FOUND.getStatus())
                .message(ex.getMessage())
                .path(request.getRequestURI()).build();
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
    }

    // Handler Already Exists Exception
    @ExceptionHandler(AlreadyExistsException.class)
    public ResponseEntity<ErrorResponse> handleAlreadyExistsException(AlreadyExistsException ex) {
        ErrorResponse errorResponse = ErrorResponse.builder()
                .code(ResponseStatus.CONFLICT.getCode())
                .status(ResponseStatus.CONFLICT.getStatus())
                .message(ex.getMessage())
                .path(request.getRequestURI()).build();
        return ResponseEntity.status(HttpStatus.CONFLICT).body(errorResponse);
    }

    // Handler All Remaining Exception
    @ExceptionHandler({Exception.class, RuntimeException.class})
    public ResponseEntity<ErrorResponse> handleException(Exception ex) {
        ErrorResponse errorResponse = ErrorResponse.builder()
                .code(HttpStatus.BAD_REQUEST.value())
                .status(ResponseStatus.BAD_REQUEST.getStatus())
                .message(ex.getMessage())
                .path(request.getRequestURI()).build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
    }

}

