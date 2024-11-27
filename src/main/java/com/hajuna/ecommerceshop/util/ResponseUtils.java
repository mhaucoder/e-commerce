package com.hajuna.ecommerceshop.util;

import com.hajuna.ecommerceshop.common.APIResponse;
import com.hajuna.ecommerceshop.enums.ResponseStatus;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseUtils {
    public static <T> ResponseEntity<APIResponse> ok(T responseDTO) {
        APIResponse responseBody = APIResponse.builder()
                .code(ResponseStatus.SUCCESS.getCode())
                .status(ResponseStatus.SUCCESS.getStatus())
                .data(responseDTO)
                .build();
        return ResponseEntity.status(HttpStatus.OK).body(responseBody);
    }
    public static <T> ResponseEntity<APIResponse> ok(T responseDTO, String message) {
        APIResponse responseBody = APIResponse.builder()
                .code(ResponseStatus.SUCCESS.getCode())
                .status(ResponseStatus.SUCCESS.getStatus())
                .message(message)
                .data(responseDTO)
                .build();
        return ResponseEntity.status(HttpStatus.OK).body(responseBody);
    }
    public static <T> ResponseEntity<APIResponse> badRequest(T responseDTO) {
        APIResponse responseBody = APIResponse.<T>builder()
                .code(ResponseStatus.BAD_REQUEST.getCode())
                .status(ResponseStatus.BAD_REQUEST.getStatus())
                .data(responseDTO)
                .build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseBody);
    }
    public static <T> ResponseEntity<APIResponse> badRequest(T responseDTO, String message) {
        APIResponse responseBody = APIResponse.<T>builder()
                .code(ResponseStatus.BAD_REQUEST.getCode())
                .status(ResponseStatus.BAD_REQUEST.getStatus())
                .message(message)
                .data(responseDTO)
                .build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseBody);
    }
    public static <T> ResponseEntity<APIResponse> notFound(T responseDTO) {
        APIResponse responseBody = APIResponse.builder()
                .code(ResponseStatus.NOT_FOUND.getCode())
                .status(ResponseStatus.NOT_FOUND.getStatus())
                .data(responseDTO)
                .build();
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(responseBody);
    }

    public static <T> ResponseEntity<APIResponse> notFound(T responseDTO, String message) {
        APIResponse responseBody = APIResponse.<T>builder()
                .code(ResponseStatus.NOT_FOUND.getCode())
                .status(ResponseStatus.NOT_FOUND.getStatus())
                .message(message)
                .data(responseDTO)
                .build();
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(responseBody);
    }

    public static <T> ResponseEntity<APIResponse> forbidden(T responseDTO) {
        APIResponse responseBody = APIResponse.builder()
                .code(ResponseStatus.FORBIDDEN.getCode())
                .status(ResponseStatus.FORBIDDEN.getStatus())
                .data(responseDTO)
                .build();
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(responseBody);
    }

    public static <T> ResponseEntity<APIResponse> forbidden(T responseDTO, String message) {
        APIResponse responseBody = APIResponse.<T>builder()
                .code(ResponseStatus.FORBIDDEN.getCode())
                .status(ResponseStatus.FORBIDDEN.getStatus())
                .message(message)
                .data(responseDTO)
                .build();
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(responseBody);
    }

    public static <T> ResponseEntity<APIResponse> internalServerError(T responseDTO) {
        APIResponse responseBody = APIResponse.<T>builder()
                .code(ResponseStatus.INTERNAL_SERVER_ERROR.getCode())
                .status(ResponseStatus.INTERNAL_SERVER_ERROR.getStatus())
                .data(responseDTO)
                .build();
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(responseBody);
    }

    public static <T> ResponseEntity<APIResponse> internalServerError(T responseDTO, String message) {
        APIResponse responseBody = APIResponse.builder()
                .code(ResponseStatus.INTERNAL_SERVER_ERROR.getCode())
                .status(ResponseStatus.INTERNAL_SERVER_ERROR.getStatus())
                .message(message)
                .data(responseDTO)
                .build();
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(responseBody);
    }

    public static <T> ResponseEntity<APIResponse> unauthorized(T responseDTO) {
        APIResponse responseBody = APIResponse.<T>builder()
                .code(ResponseStatus.UNAUTHORIZED.getCode())
                .status(ResponseStatus.UNAUTHORIZED.getStatus())
                .data(responseDTO)
                .build();
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(responseBody);
    }

    public static <T> ResponseEntity<APIResponse> unauthorized(T responseDTO, String message) {
        APIResponse responseBody = APIResponse.<T>builder()
                .code(ResponseStatus.UNAUTHORIZED.getCode())
                .status(ResponseStatus.UNAUTHORIZED.getStatus())
                .message(message)
                .data(responseDTO)
                .build();
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(responseBody);
    }

    public static <T> ResponseEntity<APIResponse> created(T responseDTO) {
        APIResponse responseBody = APIResponse.<T>builder()
                .code(ResponseStatus.CREATED.getCode())
                .status(ResponseStatus.CREATED.getStatus())
                .data(responseDTO)
                .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(responseBody);
    }

    public static <T> ResponseEntity<APIResponse> created(T responseDTO, String message) {
        APIResponse responseBody = APIResponse.<T>builder()
                .code(ResponseStatus.CREATED.getCode())
                .status(ResponseStatus.CREATED.getStatus())
                .message(message)
                .data(responseDTO)
                .build();
        return ResponseEntity.status(HttpStatus.CREATED).body(responseBody);
    }

    public static <T> ResponseEntity<APIResponse> accepted(T responseDTO) {
        APIResponse responseBody = APIResponse.builder()
                .code(ResponseStatus.ACCEPTED.getCode())
                .status(ResponseStatus.ACCEPTED.getStatus())
                .data(responseDTO)
                .build();
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(responseBody);
    }

    public static <T> ResponseEntity<APIResponse> accepted(T responseDTO, String message) {
        APIResponse responseBody = APIResponse.builder()
                .code(ResponseStatus.ACCEPTED.getCode())
                .status(ResponseStatus.ACCEPTED.getStatus())
                .message(message)
                .data(responseDTO)
                .build();
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(responseBody);
    }

    public static <T> ResponseEntity<APIResponse> noContent() {
        APIResponse responseBody = APIResponse.<T>builder()
                .code(ResponseStatus.NO_CONTENT.getCode())
                .status(ResponseStatus.NO_CONTENT.getStatus())
                .build();
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(responseBody);
    }

    public static <T> ResponseEntity<APIResponse> noContent(String message) {
        APIResponse responseBody = APIResponse.builder()
                .code(ResponseStatus.NO_CONTENT.getCode())
                .status(ResponseStatus.NO_CONTENT.getStatus())
                .message(message)
                .build();
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(responseBody);
    }
}
