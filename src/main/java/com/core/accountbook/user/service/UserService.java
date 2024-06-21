package com.core.accountbook.user.service;

import com.core.accountbook.user.domain.User;
import com.core.accountbook.user.domain.dto.CreateUser;

public interface UserService {

    User createUser(CreateUser createUser);
}
