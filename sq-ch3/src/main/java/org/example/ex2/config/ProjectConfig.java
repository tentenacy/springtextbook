package org.example.ex2.config;

import org.example.ex2.main.Parrot;
import org.example.ex2.main.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    public Person person() {
        Person p = new Person();
        p.setName("Elia");
        p.setParrot(parrot());
        return p;
    }
}
