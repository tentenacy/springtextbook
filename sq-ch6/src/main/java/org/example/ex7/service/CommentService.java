package org.example.ex7.service;

import org.example.ex7.aspect.ToLog;
import org.example.ex7.model.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {

    private Logger logger = Logger.getLogger(CommentService.class.getName());

    @ToLog
    public String publishComment(Comment comment) {
        logger.info("Publishing comment " + comment.getText());
        return "SUCCESS";
    }
}
