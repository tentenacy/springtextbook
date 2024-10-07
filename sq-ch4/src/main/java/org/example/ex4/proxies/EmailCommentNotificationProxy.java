package org.example.ex4.proxies;

import org.example.ex4.model.Comment;
import org.springframework.stereotype.Component;

public class EmailCommentNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: " + comment.getText());
    }
}
