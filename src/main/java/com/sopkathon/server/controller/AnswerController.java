package com.sopkathon.server.controller;

import com.sopkathon.server.common.dto.ApiResponseDto;
import com.sopkathon.server.common.exception.SuccessStatus;
import com.sopkathon.server.dto.request.DeleteResultRequestDto;
import com.sopkathon.server.dto.request.SaveResultsDto;
import com.sopkathon.server.service.AnswerService;
import com.sopkathon.server.service.ResultService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;



@RestController
@RequiredArgsConstructor
public class AnswerController {
    private final AnswerService answerService;
    private final ResultService resultService;

    @DeleteMapping("/answer")
    public ApiResponseDto deleteAnswer(
            @RequestHeader("user-id") Long userId,
            @RequestBody DeleteResultRequestDto requestDto
    ) {
        answerService.deleteAnswer(userId, requestDto);
        return ApiResponseDto.success(SuccessStatus.DELETE_RESULT);
    }

    @PostMapping("/answer")
    public ApiResponseDto saveResult( @RequestBody SaveResultsDto request){
        resultService.createResult(request);
        return ApiResponseDto.success(SuccessStatus.SAVE_ANSWERS);
    }

}
