package com.sopkathon.server.controller;

import com.sopkathon.server.common.dto.ApiResponseDto;
import com.sopkathon.server.common.exception.SuccessStatus;
import com.sopkathon.server.dto.response.GetMainDto;
import com.sopkathon.server.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainController {
    private final MainService mainService;

    @GetMapping("/main")
    public ApiResponseDto<GetMainDto> getQuestion(
            @RequestHeader("user-id") Long userId) {
        System.out.println("안녕");
        return ApiResponseDto.success(SuccessStatus.GET_RESULT, mainService.getMain(userId));

    }
}
