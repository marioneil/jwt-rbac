package com.weather.rbac.jwt.dto;

import lombok.Data;

@Data
public class UserLogin {
    private String username;
    private String password;
}

