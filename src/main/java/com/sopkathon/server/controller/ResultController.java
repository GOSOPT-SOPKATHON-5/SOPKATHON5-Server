package com.sopkathon.server.controller;

import com.sopkathon.server.common.dto.ApiResponseDto;
import com.sopkathon.server.common.exception.SuccessStatus;
import com.sopkathon.server.dto.request.UpdateUserPointDto;
import com.sopkathon.server.service.ResultService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static com.sopkathon.server.common.exception.ErrorStatus.INTERNAL_SERVER_ERROR;
import static com.sopkathon.server.common.exception.SuccessStatus.VIEW_ANASWER;

@RestController
@RequiredArgsConstructor
public class ResultController {

    private final ResultService resultService;

    @GetMapping("/result/{answerId}/detail")
    public ApiResponseDto viewResult(@RequestHeader("user-id") @Valid Long userId, @Valid @PathVariable Long answerId){
        resultService.viewResult(userId, answerId);
        return ApiResponseDto.success(VIEW_ANASWER);
    }

}
