package org.example.ex4.proxies;

import org.example.ex4.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
