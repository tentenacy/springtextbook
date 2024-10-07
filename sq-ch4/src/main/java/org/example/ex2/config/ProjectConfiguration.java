package org.example.ex2.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example.ex2.proxies", "org.example.ex2.services", "org.example.ex2.repositories"})
public class ProjectConfiguration {

}
