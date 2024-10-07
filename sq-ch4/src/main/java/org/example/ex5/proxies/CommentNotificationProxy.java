package org.example.ex5.proxies;

import org.example.ex5.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
