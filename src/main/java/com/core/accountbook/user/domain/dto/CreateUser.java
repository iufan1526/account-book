package com.core.accountbook.user.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUser {

    private String email;

    private String password;

    private String nickname;
}
