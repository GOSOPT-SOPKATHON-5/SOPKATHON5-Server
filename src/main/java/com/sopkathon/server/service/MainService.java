package com.sopkathon.server.service;

import com.sopkathon.server.domain.Result;
import com.sopkathon.server.domain.User;
import com.sopkathon.server.dto.response.GetMainDto;
import com.sopkathon.server.dto.response.UserAnswers;
import com.sopkathon.server.repository.ResultRepository;
import com.sopkathon.server.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional
public class MainService {
    private final UserRepository userRepository;
    private final ResultRepository resultRepository;

    public GetMainDto getMain(Long userId) {
        User user = userRepository.findById(userId).orElseThrow();

        List<Result> byReceiver = resultRepository.findAllByReceiver(user);

        List<UserAnswers> userAnswers = byReceiver.stream()
                .map(m -> new UserAnswers(
                        m.getId(),
                        m.getAnswer().getAnswer(),
                        dateFormat(m.getCreatedAt())))
                .collect(Collectors.toList());

        return GetMainDto.builder()
                .userName(user.getName())
                .userPoint(user.getPoint())
                .userAnswers(userAnswers)
                .build();
    }

    private String dateFormat(LocalDateTime localDateTime) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return localDateTime.format(dateTimeFormatter).toString();
    }

}
