package com.sopkathon.server.controller;

import com.sopkathon.server.common.dto.ApiResponseDto;
import com.sopkathon.server.common.exception.SuccessStatus;
import com.sopkathon.server.dto.request.UpdateUserPointDto;
import com.sopkathon.server.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static com.sopkathon.server.common.exception.ErrorStatus.INTERNAL_SERVER_ERROR;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PatchMapping("/user/point")
    @ResponseStatus(HttpStatus.OK)
    public ApiResponseDto updateUserPoint(@RequestHeader("user-id") @Valid Long userId, @RequestBody @Valid UpdateUserPointDto changeStatus){
        boolean response;
        System.out.println(userId);
        System.out.println(changeStatus);
        if(changeStatus.getChangeStatus()){
            response = userService.addUserPoint(userId);
        }
        else{
            response = userService.subUserPoint(userId);
        }
        if(response) {
            return ApiResponseDto.success(SuccessStatus.CHANGE_POINT_SUCCESS);
        }
        return ApiResponseDto.error(INTERNAL_SERVER_ERROR);
    }


}
