package com.authenticates.authenticates;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.authenticates.authenticates.models"})
@ComponentScan(basePackages = {"com.authenticates.*"})
@EnableJpaRepositories(basePackages = {"com.authenticates.authenticates.repository"})
public class AuthenticatesApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthenticatesApplication.class, args);
    }

}
