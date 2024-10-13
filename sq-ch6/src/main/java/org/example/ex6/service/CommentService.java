package org.example.ex6.service;

import org.example.ex6.aspect.ToLog;
import org.example.ex6.model.Comment;
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
