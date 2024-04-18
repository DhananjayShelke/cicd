package com.github.actions.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/cicd")
public class CicdApplication {

    public static void main(String[] args) {
        SpringApplication.run(CicdApplication.class, args);
    }

    @GetMapping
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello Dhananjay");
    }
}
