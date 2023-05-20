package com.sopkathon.server.repository;

import com.sopkathon.server.domain.Answer;
import com.sopkathon.server.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {

}
