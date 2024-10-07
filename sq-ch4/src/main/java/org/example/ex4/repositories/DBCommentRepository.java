package org.example.ex4.repositories;

import org.example.ex4.model.Comment;
import org.springframework.stereotype.Component;

public class DBCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment.getText());
    }
}
