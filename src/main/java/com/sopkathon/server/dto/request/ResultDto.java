package com.sopkathon.server.dto.request;

import lombok.Data;

@Data
public class ResultDto {
    Long receiverId;
    Long senderId;
    Long answerId;
}
