package com.sopkathon.server.dto.response;

import lombok.Builder;

import java.util.List;

public class AnswerDetailResponseDto {

    Long senderId;
    String senderName;
    Long answerId;
    List<AnswerResponseDto> answers;

    @Builder

    public AnswerDetailResponseDto(Long senderId, String senderName, Long answerId, List<AnswerResponseDto> answers) {
        this.senderId = senderId;
        this.senderName = senderName;
        this.answerId = answerId;
        this.answers = answers;
    }
}
