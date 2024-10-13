package org.example.ex1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"org.example.ex1.aspect", "org.example.ex1.service"})
@EnableAspectJAutoProxy
public class ProjectConfig {
}
