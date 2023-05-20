package com.sopkathon.server.controller;

import com.sopkathon.server.common.dto.ApiResponseDto;
import com.sopkathon.server.common.exception.SuccessStatus;
import com.sopkathon.server.dto.request.DeleteResultRequestDto;
import com.sopkathon.server.service.AnswerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class AnswerController {
    private final AnswerService answerService;

    @DeleteMapping("/answer")
    public ApiResponseDto deleteAnswer(
            @RequestHeader("user-id") Long userId,
            DeleteResultRequestDto requestDto
    ) {
        answerService.deleteAnswer(userId, requestDto);
        return ApiResponseDto.success(SuccessStatus.DELETE_RESULT);
    }
}
