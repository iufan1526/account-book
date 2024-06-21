package com.core.accountbook.user.service.impl;

import com.core.accountbook.user.domain.User;
import com.core.accountbook.user.domain.dto.CreateUser;
import com.core.accountbook.user.repository.UserRepository;
import com.core.accountbook.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(CreateUser createUser) {
        userRepository.exists(createUser.getEmail());


        User user = User.builder()
                        .email(createUser.getEmail())
                        .nickname(createUser.getNickname())
                        .password(createUser.getPassword())
                        .build();

        return userRepository.save(user);
    }
}
