package com.sopkathon.server.service;

import com.sopkathon.server.domain.User;
import com.sopkathon.server.dto.request.DeleteResultRequestDto;
import com.sopkathon.server.repository.AnswerRepository;
import com.sopkathon.server.repository.ResultRepository;
import com.sopkathon.server.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
@Transactional
public class AnswerService {
    private final AnswerRepository answerRepository;
    private final UserRepository userRepository;
    private final ResultRepository resultRepository;

    @Transactional
    public void deleteAnswer(Long userId, DeleteResultRequestDto requestDto){

        User user = userRepository.findById(userId).orElseThrow();

        System.out.println(requestDto.getId());

        resultRepository.deleteById(requestDto.getId());

    }
}
