package org.example;

import org.example.model.Person;
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
}
