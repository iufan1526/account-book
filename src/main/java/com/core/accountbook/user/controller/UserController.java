package com.core.accountbook.user.controller;

import com.core.accountbook.user.domain.User;
import com.core.accountbook.user.domain.dto.CreateUser;
import com.core.accountbook.user.repository.UserRepository;
import com.core.accountbook.user.service.UserService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user")
public class UserController {

    private final Logger log = LoggerFactory.getLogger(getClass());
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping()
    public String createUser(@Valid @RequestBody CreateUser createUser) {

        log.debug("컨트롤러 호출");

        return "호출완료";
    }
}
