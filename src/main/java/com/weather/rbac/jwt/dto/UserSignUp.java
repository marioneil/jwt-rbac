package com.weather.rbac.jwt.dto;

import lombok.Data;

import java.util.Set;

@Data
public class UserSignUp {

	  private String username;

	  private String email;

	  private Set<String> role;

	  private String password;

}