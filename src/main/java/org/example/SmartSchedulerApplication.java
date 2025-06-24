package org.example;

import org.example.model.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Hello world!
 *
 */

@SpringBootApplication  // <-- Вот эта аннотация делает приложение Spring Boot
public class SmartSchedulerApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(SmartSchedulerApplication.class, args);
    }
    @Bean
    public CommandLineRunner dataLoader(PersonRepository repo) {
        return args -> {
            repo.save(new Person("Alice"));
            repo.save(new Person("Bob"));
        };
    }

}
