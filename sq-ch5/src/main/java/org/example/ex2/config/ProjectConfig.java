package org.example.ex2.config;

import org.example.ex2.service.CommentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example.ex2.repository", "org.example.ex2.service"})
public class ProjectConfig {
}
