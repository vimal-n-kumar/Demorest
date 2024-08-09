package com.gcp.demorest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class DemorestApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemorestApplication.class, args);
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return Arrays.asList(
                new User(1, "John Doe", "john.doe@example.com"),
                new User(2, "Jane Smith", "jane.smith@example.com"),
                new User(3, "Bob Johnson", "bob.johnson@example.com")
        );
    }

    public static class User {
        private int id;
        private String name;
        private String email;

        public User(int id, String name, String email) {
            this.id = id;
            this.name = name;
            this.email = email;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }
    }
}