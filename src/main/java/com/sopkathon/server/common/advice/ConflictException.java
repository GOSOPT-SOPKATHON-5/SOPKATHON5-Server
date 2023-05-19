package com.sopkathon.server.common.advice;

import com.sopkathon.server.common.exception.ErrorStatus;

public class ConflictException extends CustomException{
    public ConflictException(ErrorStatus error, String message) {
        super(error, message);
    }
}
