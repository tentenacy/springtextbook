package org.example.ex3.main;

import org.example.ex3.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext(ProjectConfig.class);
    }
}
