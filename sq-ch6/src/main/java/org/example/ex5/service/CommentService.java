package org.example.ex5.service;

import org.example.ex5.aspect.ToLog;
import org.example.ex5.model.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {

    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public void publishComment(Comment comment) {
        logger.info("Publishing comment " + comment.getText());
    }

    @ToLog
    public void deleteComment(Comment comment) {
        logger.info("Deleting comment " + comment.getText());
    }

    public void editComment(Comment comment) {
        logger.info("Editing comment " + comment.getText());
    }
}
