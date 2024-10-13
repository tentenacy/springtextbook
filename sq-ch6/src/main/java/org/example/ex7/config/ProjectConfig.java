package org.example.ex7.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"org.example.ex7.aspect", "org.example.ex7.service"})
@EnableAspectJAutoProxy
public class ProjectConfig {
}
