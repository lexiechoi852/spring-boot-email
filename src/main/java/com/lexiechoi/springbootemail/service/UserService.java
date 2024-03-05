package com.lexiechoi.springbootemail.service;

import com.lexiechoi.springbootemail.domain.User;

public interface UserService {
    User saveUser(User user);
    Boolean verifyToken(String token);
}
