package com.kkwonsy.authorizationserver.service;

import org.springframework.security.authentication.AccountStatusUserDetailsChecker;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.kkwonsy.authorizationserver.domain.User;
import com.kkwonsy.authorizationserver.domain.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class CustomUserDetailService implements UserDetailsService {

    private final UserRepository userRepository;
    private final AccountStatusUserDetailsChecker detailsChecker = new AccountStatusUserDetailsChecker();

    @Override
    public UserDetails loadUserByUsername(String name) {
        User user = userRepository.findByUid(name)
            .orElseThrow(() -> new UsernameNotFoundException("User does not exist"));
        detailsChecker.check(user);
        return user;
    }

}