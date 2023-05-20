package com.sopkathon.server.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserAnswers {
    private Long id;
    private String answer;
    private String createdAt;
}
