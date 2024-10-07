package org.example.ex1.repositories;

import org.example.ex1.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
