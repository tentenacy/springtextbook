package org.example.ex6.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example.ex6.proxies", "org.example.ex6.services", "org.example.ex6.repositories"})
public class ProjectConfiguration {

}
