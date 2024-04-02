package org.example;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ru.netology.repository.UserRepository;
import ru.netology.service.AuthorizationService;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    private UserRepository userRepository() {
        return new UserRepository();
    }

    @Bean
    private AuthorizationService authorizationService(final UserRepository userRepository) {
        return new AuthorizationService(userRepository);
    }
}
