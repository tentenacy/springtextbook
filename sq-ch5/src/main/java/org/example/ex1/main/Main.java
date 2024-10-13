package org.example.ex1.main;

import org.example.ex1.config.ProjectConfig;
import org.example.ex1.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService cs1 = c.getBean("commentService", CommentService.class);
        CommentService cs2 = c.getBean("commentService", CommentService.class);

        boolean b1 = cs1 == cs2;

        System.out.println(b1);
    }
}