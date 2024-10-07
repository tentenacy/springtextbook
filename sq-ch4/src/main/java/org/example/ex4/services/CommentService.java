package org.example.ex4.services;

import org.example.ex4.model.Comment;
import org.example.ex4.proxies.CommentNotificationProxy;
import org.example.ex4.repositories.CommentRepository;
import org.springframework.stereotype.Component;

public class CommentService {

    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
