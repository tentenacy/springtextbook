package org.example.ex6.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example.ex6.repository", "org.example.ex6.service"})
public class ProjectConfig {

}
