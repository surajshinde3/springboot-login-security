package com.zensar.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.zensar.dto.UserRegistrationDto;
import com.zensar.model.User;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
