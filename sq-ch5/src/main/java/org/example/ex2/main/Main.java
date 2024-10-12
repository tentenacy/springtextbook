package org.example.ex2.main;

import org.example.ex2.config.ProjectConfig;
import org.example.ex2.service.CommentService;
import org.example.ex2.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService s1 = c.getBean(CommentService.class);
        UserService s2 = c.getBean(UserService.class);

        boolean b = s1.getCommentRepository() == s2.getCommentRepository();

        System.out.println(b);
    }
}
