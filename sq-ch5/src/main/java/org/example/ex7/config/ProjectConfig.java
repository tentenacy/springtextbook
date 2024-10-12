package org.example.ex7.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example.ex7.repository", "org.example.ex7.service", "org.example.ex7.processor"})
public class ProjectConfig {
}
