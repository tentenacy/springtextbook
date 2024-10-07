package org.example.ex7.proxies;

import org.example.ex7.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
