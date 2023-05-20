package com.sopkathon.server.repository;

import com.sopkathon.server.domain.Result;

import com.sopkathon.server.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ResultRepository extends JpaRepository<Result, Long> {
    Result save(Result result);
    Optional<Result> findByReceiverIdAndAnswerId(Long receiverId, Long answerId);
    List<Result> findAllByReceiver(User user);
}
