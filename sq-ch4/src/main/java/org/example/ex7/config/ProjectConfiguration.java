package org.example.ex7.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example.ex7.proxies", "org.example.ex7.services", "org.example.ex7.repositories"})
public class ProjectConfiguration {

}
