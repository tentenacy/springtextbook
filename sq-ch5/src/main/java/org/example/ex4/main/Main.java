package org.example.ex4.main;

import org.example.ex4.config.ProjectConfig;
import org.example.ex4.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println("Before retrieving the CommentService");
        CommentService service = c.getBean(CommentService.class);
        System.out.println("After retrieving the CommentService");
    }
}
