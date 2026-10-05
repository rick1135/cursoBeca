package com.beca.cursoBeca.config;

import com.beca.cursoBeca.entity.User;
import com.beca.cursoBeca.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private final UserRepository userRepository;

    public TestConfig(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        User u1 = userRepository.save(new User(null, "Maria", "maria@gmail.com", "98888888", "123456"));
        User u2 = userRepository.save(new User(null, "Alex", "alex@gmail.com", "977777777", "123456"));

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
