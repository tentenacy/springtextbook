package org.example.ex1.main;

import org.example.ex1.model.Comment;
import org.example.ex1.proxies.CommentNotificationProxy;
import org.example.ex1.proxies.EmailCommentNotificationProxy;
import org.example.ex1.repositories.CommentRepository;
import org.example.ex1.repositories.DBCommentRepository;
import org.example.ex1.services.CommentService;

public class Main {
    public static void main(String[] args) {
        CommentRepository commentRepository = new DBCommentRepository();
        CommentNotificationProxy commentNotificationProxy = new EmailCommentNotificationProxy();

        CommentService commentService = new CommentService(commentRepository, commentNotificationProxy);

        Comment comment = new Comment();
        comment.setAuthor("Laurentiu");
        comment.setText("Demo comment");

        commentService.publishComment(comment);
    }
}