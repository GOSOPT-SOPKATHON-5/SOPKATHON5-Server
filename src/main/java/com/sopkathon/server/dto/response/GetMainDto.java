package com.sopkathon.server.dto.response;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class GetMainDto {
    private String userName;
    private Long userPoint;
    List<UserAnswers> userAnswers;
}
