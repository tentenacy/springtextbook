package org.example.ex3.proxies;

import org.example.ex3.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
