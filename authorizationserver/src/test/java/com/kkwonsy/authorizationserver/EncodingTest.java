package com.kkwonsy.authorizationserver;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
public class EncodingTest {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    public void encodeTest() {
        System.out.printf("testSecret : %s\n", passwordEncoder.encode("testSecret"));
    }

}
