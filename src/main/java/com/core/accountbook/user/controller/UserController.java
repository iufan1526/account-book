package com.core.accountbook.user.controller;

import com.core.accountbook.user.domain.User;
import com.core.accountbook.user.domain.dto.CreateUser;
import com.core.accountbook.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user")
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping()
    public User createUser(@RequestBody CreateUser createUser) {

        User user = new User();
        user.setEmail(createUser.getEmail());
        user.setNickname(createUser.getNickname());
        user.setPassword(createUser.getPassword());

        return userRepository.save(user);
    }
}
