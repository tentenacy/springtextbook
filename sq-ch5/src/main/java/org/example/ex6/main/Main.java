package org.example.ex6.main;

import org.example.ex6.config.ProjectConfig;
import org.example.ex6.service.CommentService;
import org.example.ex6.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var s1 = c.getBean(CommentService.class);
        var s2 = c.getBean(UserService.class);

        boolean b = s1.getCommentRepository() == s2.getCommentRepository();
        System.out.println(b);
    }
}
