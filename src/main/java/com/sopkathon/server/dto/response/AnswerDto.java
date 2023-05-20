package com.sopkathon.server.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
public class AnswerDto {
    private Long id;
    private String answer;
}
