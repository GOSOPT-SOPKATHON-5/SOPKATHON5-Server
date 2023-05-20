package com.sopkathon.server.service;

import com.sopkathon.server.domain.User;
import com.sopkathon.server.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public boolean addUserPoint(Long userId){
        User user = userRepository.findById(userId).orElse(null);
        System.out.println(user.getName());
        user.addPoint();
        return true;
    }

    @Transactional
    public boolean subUserPoint(Long userId){
        User user = userRepository.findById(userId).orElse(null);
        System.out.println(user.getName());
        user.subPoint();
        return true;
    }
}
