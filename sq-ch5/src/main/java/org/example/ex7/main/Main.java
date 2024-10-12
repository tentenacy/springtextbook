package org.example.ex7.main;

import org.example.ex7.config.ProjectConfig;
import org.example.ex7.model.Comment;
import org.example.ex7.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext(ProjectConfig.class);
        CommentService s = c.getBean(CommentService.class);
        s.sendComment(new Comment());
        s.sendComment(new Comment());
    }
}
