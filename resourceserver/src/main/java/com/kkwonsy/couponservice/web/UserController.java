package com.kkwonsy.couponservice.web;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.kkwonsy.couponservice.domain.user.User;
import com.kkwonsy.couponservice.domain.user.UserRepository;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/v1")
public class UserController {

    private final UserRepository userRepository;

    @GetMapping(value = "/users")
    public List<User> findAllUser() {
        return userRepository.findAll();
    }
}