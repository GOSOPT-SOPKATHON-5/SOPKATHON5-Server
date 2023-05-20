package com.sopkathon.server.dto.response;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class GetQuestionDto {
    private Long receiverId;
    private String receiverName;
    private String question;
    private List<AnswerDto> answers;
}
