package com.sopkathon.server.repository;

import com.sopkathon.server.domain.Answer;
import com.sopkathon.server.domain.Question;
import com.sopkathon.server.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

}
