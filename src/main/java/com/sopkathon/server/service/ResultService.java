package com.sopkathon.server.service;

import com.sopkathon.server.domain.Answer;
import com.sopkathon.server.domain.Question;
import com.sopkathon.server.domain.Result;
import com.sopkathon.server.domain.User;
import com.sopkathon.server.dto.request.ResultDto;
import com.sopkathon.server.dto.request.SaveResultsDto;
import com.sopkathon.server.dto.response.AnswerDetailResponseDto;
import com.sopkathon.server.dto.response.AnswerResponseDto;
import com.sopkathon.server.repository.AnswerRepository;
import com.sopkathon.server.repository.QuestionRepository;
import com.sopkathon.server.repository.ResultRepository;
import com.sopkathon.server.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@RequiredArgsConstructor
@Service
public class ResultService {
    private final ResultRepository resultRepository;
    private final UserRepository userRepository;
    private final AnswerRepository answerRepository;
    private final QuestionRepository questionRepository;

    public void createResult(SaveResultsDto results) {

        User sender;
        User receiver;
        Answer answer;

        for (ResultDto resultDto : results.getResults()) {
            sender = userRepository.findById(resultDto.getSenderId()).orElse(null);
            receiver = userRepository.findById(resultDto.getReceiverId()).orElse(null);
            answer = answerRepository.findById(resultDto.getAnswerId()).orElse(null);
            resultRepository.save(Result.newInstance(sender,receiver,answer));
        }
    }

    public AnswerDetailResponseDto viewResult(Long userId, Long answerId){
        Answer answer = answerRepository.findById(answerId).orElse(null);
        Question question = questionRepository.findById(answer.getQuestion().getId()).orElse(null);
        List<Answer> answers = answerRepository.findAllByQuestionId(question.getId());
        List<AnswerResponseDto> results = new ArrayList<>();
        for(Answer addAnswer: answers){
            System.out.println(addAnswer.getAnswer()+"답변이다리");
            results.add(AnswerResponseDto.builder().id(addAnswer.getId()).answer(addAnswer.getAnswer()).build());
        }
        System.out.println(userId);
        System.out.println(answerId);
        Result result = resultRepository.findByReceiverIdAndAnswerId(userId, answerId)
                .orElseThrow(() -> new RuntimeException("ASDASDASD"));
        System.out.println(result.getReceiver());
        User user = userRepository.findById(result.getReceiver().getId()).orElse(null);
        String userName = user.getName();
        return AnswerDetailResponseDto.builder().senderId(user.getId()).senderName(userName).answerId(answer.getId()).answers(results).build();
    }
}
