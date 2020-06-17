package com.kkwonsy.authorizationserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;


@SpringBootApplication(exclude = LiquibaseAutoConfiguration.class)
public class AuthorizationserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthorizationserverApplication.class, args);
    }
}
