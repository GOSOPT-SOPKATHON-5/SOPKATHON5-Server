package com.sopkathon.server.controller;

import com.sopkathon.server.common.dto.ApiResponseDto;
import com.sopkathon.server.common.exception.SuccessStatus;
import com.sopkathon.server.dto.response.GetQuestionDto;
import com.sopkathon.server.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class QuestionController {
    private final QuestionService questionService;

    @GetMapping("/question")
    public ApiResponseDto<GetQuestionDto> getQuestion(
            @RequestHeader("user-id") Long userId) {
        return ApiResponseDto.success(SuccessStatus.GET_RESULT, questionService.getQuestion(userId));

    }
}
