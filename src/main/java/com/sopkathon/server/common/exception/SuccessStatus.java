package com.sopkathon.server.common.exception;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum SuccessStatus {
    /*
    user
     */
    SIGNUP_SUCCESS(HttpStatus.CREATED, "회원가입이 완료되었습니다."),
    GET_RESULT(HttpStatus.OK, "조회 성공하였습니다."),
    /*
    answer
     */
    DELETE_RESULT(HttpStatus.OK, "결과 조회 완료후, 삭제 하였습니다."),

    CHANGE_POINT_SUCCESS(HttpStatus.OK, "해당 사용자의 포인트가 변경되었습니다"),

    SAVE_ANSWERS(HttpStatus.CREATED, "해당 사용자의 포인트가 변경되었습니다"),

    VIEW_ANASWER(HttpStatus.OK, "답변 상세보기 조회 성공")

    ;

    private final HttpStatus httpStatus;
    private final String message;

    public int getHttpStatusCode() {
        return httpStatus.value();
    }

}
