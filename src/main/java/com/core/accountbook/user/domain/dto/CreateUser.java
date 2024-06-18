package com.core.accountbook.user.domain.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUser {

    @Email
    @NotNull
    public String email;

    @NotNull
    private String password;

    @NotNull
    private String nickname;
}
