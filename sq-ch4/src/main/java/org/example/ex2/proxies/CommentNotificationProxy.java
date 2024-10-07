package org.example.ex2.proxies;

import org.example.ex2.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
