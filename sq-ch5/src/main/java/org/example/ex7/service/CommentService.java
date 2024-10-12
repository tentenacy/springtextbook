package org.example.ex7.service;

import org.example.ex7.model.Comment;
import org.example.ex7.processor.CommentProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private ApplicationContext context;

    public void sendComment(Comment c) {

        CommentProcessor p = context.getBean(CommentProcessor.class);

        System.out.println(System.identityHashCode(p));

        p.setComment(c);
        p.processComment(c);
        p.validateComment(c);

        c = p.getComment();
        // 추가 작업 수행
    }
}
