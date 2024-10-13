package org.example.ex6.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"org.example.ex6.aspect", "org.example.ex6.service"})
@EnableAspectJAutoProxy
public class ProjectConfig {
}
