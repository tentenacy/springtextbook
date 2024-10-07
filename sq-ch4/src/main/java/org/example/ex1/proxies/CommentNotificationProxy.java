package org.example.ex1.proxies;

import org.example.ex1.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
