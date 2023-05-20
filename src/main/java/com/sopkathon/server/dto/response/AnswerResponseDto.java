package com.sopkathon.server.dto.response;

import lombok.Builder;

public class AnswerResponseDto {
    Long id;
    String answer;

    @Builder
    public AnswerResponseDto(Long id, String answer) {
        this.id = id;
        this.answer = answer;
    }
}
