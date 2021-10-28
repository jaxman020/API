package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student johnny = new Student(
                    1L,
                    "Johnny",
                    "jaxman020@gmail.com",
                    LocalDate.of(1980, Month.JANUARY, 5)
            );

            Student melody = new Student(
                    2L,
                    "Melody",
                    "Melody@gmail.com",
                    LocalDate.of(1991, Month.JANUARY, 5)
            );

            repository.saveAll(
                    List.of(johnny, melody)
            );
        };
    }
}
