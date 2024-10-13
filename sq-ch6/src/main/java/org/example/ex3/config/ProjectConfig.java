package org.example.ex3.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"org.example.ex3.aspect", "org.example.ex3.service"})
@EnableAspectJAutoProxy
public class ProjectConfig {
}
