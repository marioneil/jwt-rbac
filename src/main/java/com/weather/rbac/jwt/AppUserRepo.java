package com.weather.rbac.jwt;

import com.weather.rbac.jwt.entity.AppUser;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class AppUserRepo {

	List<AppUser> appUser = new ArrayList<AppUser>();

	public Optional<AppUser> findByUsername(String username) {
		return appUser.stream().filter(user -> user.getUsername().equals(username)).findFirst();
	}

	public void save(AppUser user) {
		appUser.add(user);

	}

}