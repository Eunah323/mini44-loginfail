package com.sparta.miniproject.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class LoginRequestDto {
    private String username;
    private String password;
}
