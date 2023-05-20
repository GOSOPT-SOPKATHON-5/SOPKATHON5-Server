package com.sopkathon.server.repository;

import com.sopkathon.server.domain.Result;
import com.sopkathon.server.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResultRepository extends JpaRepository<Result, Long> {
    List<Result> findAllByReceiver(User user);
}
