package com.sopkathon.server.service;

import com.sopkathon.server.domain.Answer;
import com.sopkathon.server.domain.Question;
import com.sopkathon.server.domain.User;
import com.sopkathon.server.dto.response.AnswerDto;
import com.sopkathon.server.dto.response.GetQuestionDto;
import com.sopkathon.server.repository.AnswerRepository;
import com.sopkathon.server.repository.QuestionRepository;
import com.sopkathon.server.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class QuestionService {
    private final QuestionRepository questionRepository;
    private final AnswerRepository answerRepository;
    private final UserRepository userRepository;


    public GetQuestionDto getQuestion(Long userId){
        User users = userRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 사용자입니다."));

        // 질문, 유저 랜덤 생성
        List<Question> questionList = questionRepository.findAll();
        List<User> userList = userRepository.findAll();

        Random random = new Random();

        Question question = questionList.get(random.nextInt(questionList.size()));
        User user = userList.get(random.nextInt(userList.size()));

        List<Answer> allByQuestion = answerRepository.findAllByQuestion(question);

        List<AnswerDto> answerDtos = allByQuestion.stream()
                        .map(m-> new AnswerDto(m.getId(), m.getAnswer()))
                                .collect(Collectors.toList());
        return GetQuestionDto.builder()
                .receiverId(user.getId())
                .receiverName(user.getName())
                .question(question.getQuestion())
                .answers(answerDtos)
                .build();

    }
}
