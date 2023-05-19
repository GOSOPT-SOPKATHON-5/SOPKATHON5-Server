package com.sopkathon.server.common.advice;

import com.sopkathon.server.common.exception.ErrorStatus;

public class NotFoundException extends CustomException{
    public NotFoundException(ErrorStatus error, String message) {
        super(error, message);
    }
}
