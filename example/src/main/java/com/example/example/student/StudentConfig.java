package com.example.example.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner CommandLineRunner(StudentRepository repository) {
        return args -> {
            Student ambesh = new Student(
                    "Ambesh",
                    "ambesgaunker@gmail.com",
                    LocalDate.of(2000, Month.DECEMBER, 28),
                    21);
            Student ambesh2 = new Student(
                    "Ambesh2",
                    "ambesh2gaunker@gmail.com",
                    LocalDate.of(2004, Month.DECEMBER, 28),
                    21);

            repository.saveAll(List.of(ambesh, ambesh2));

        };
    }

}
