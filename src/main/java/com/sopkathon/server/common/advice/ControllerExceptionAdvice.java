package com.sopkathon.server.common.advice;

import com.sopkathon.server.common.dto.ApiResponseDto;
import com.sopkathon.server.common.exception.ErrorStatus;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.persistence.EntityNotFoundException;

@RestControllerAdvice
public class ControllerExceptionAdvice {
    /*
     * 400 BAD_REQUEST
     */
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class) // 어떤 에러 잡을지 알려줌
    protected ApiResponseDto handleMethodArgumentNotValidException(final MethodArgumentNotValidException e) {
        return ApiResponseDto.error(ErrorStatus.VALIDATION_REQUEST_MISSING_EXCEPTION);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(IllegalArgumentException.class)
    protected ApiResponseDto handleIllegalArgumentException(final IllegalArgumentException e) {
        return ApiResponseDto.error(ErrorStatus.VALIDATION_EXCEPTION);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(EntityNotFoundException.class)
    protected ApiResponseDto handleEntityNotFoundException(final EntityNotFoundException e) {
        return ApiResponseDto.error(ErrorStatus.VALIDATION_EXCEPTION);
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(CustomException.class)
    protected ApiResponseDto handleUnexpectedException(final CustomException e) {
        return ApiResponseDto.error(ErrorStatus.INTERNAL_SERVER_ERROR);
    }
}
