package com.sopkathon.server.common.advice;

import com.sopkathon.server.common.exception.ErrorStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CustomException extends RuntimeException{
    private final ErrorStatus errorStatus;
}
