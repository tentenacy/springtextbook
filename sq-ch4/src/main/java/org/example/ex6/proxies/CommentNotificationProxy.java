package org.example.ex6.proxies;

import org.example.ex6.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
