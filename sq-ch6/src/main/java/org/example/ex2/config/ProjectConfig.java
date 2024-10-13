package org.example.ex2.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"org.example.ex2.aspect", "org.example.ex2.service"})
@EnableAspectJAutoProxy
public class ProjectConfig {
}
