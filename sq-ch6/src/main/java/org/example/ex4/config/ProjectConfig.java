package org.example.ex4.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"org.example.ex4.aspect", "org.example.ex4.service"})
@EnableAspectJAutoProxy
public class ProjectConfig {
}
