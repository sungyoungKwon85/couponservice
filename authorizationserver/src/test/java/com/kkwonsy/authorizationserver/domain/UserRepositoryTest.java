package com.kkwonsy.authorizationserver.domain;

import java.util.Collections;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    private User user = User.builder()
        .uid("kkwonsy@gmail.com")
        .password(passwordEncoder.encode("1234"))
        .name("kkwonsy")
        .roles(Collections.singletonList("ROLE_USER"))
        .build();

    @AfterAll
    public void afterAll() {
        userRepository.deleteById(user.getId());
    }

    @Test
    public void insertNewUser() {
        userRepository.save(user);
    }
}