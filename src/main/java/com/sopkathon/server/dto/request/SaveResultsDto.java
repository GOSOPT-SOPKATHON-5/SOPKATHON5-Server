package com.sopkathon.server.dto.request;


import lombok.Data;

import java.util.List;

@Data
public class SaveResultsDto {
    List<ResultDto> results;
}
