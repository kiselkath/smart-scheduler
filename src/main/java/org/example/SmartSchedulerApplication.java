package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
