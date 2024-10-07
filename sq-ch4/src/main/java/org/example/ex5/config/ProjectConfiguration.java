package org.example.ex5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example.ex5.proxies", "org.example.ex5.services", "org.example.ex5.repositories"})
public class ProjectConfiguration {

}
