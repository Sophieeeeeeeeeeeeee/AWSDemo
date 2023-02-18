package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author Sophiee
 */
@SpringBootApplication
public class SecretsManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecretsManagerApplication.class, args);
    }

}
