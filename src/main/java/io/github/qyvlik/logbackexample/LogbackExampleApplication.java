package io.github.qyvlik.logbackexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class LogbackExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogbackExampleApplication.class, args);
    }

}
