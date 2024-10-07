package org.example.ex3.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example.ex3.proxies", "org.example.ex3.services", "org.example.ex3.repositories"})
public class ProjectConfiguration {

}
