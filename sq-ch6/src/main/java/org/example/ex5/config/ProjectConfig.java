package org.example.ex5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"org.example.ex5.aspect", "org.example.ex5.service"})
@EnableAspectJAutoProxy
public class ProjectConfig {
}
