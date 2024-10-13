package org.example.ex3.service;

import org.example.ex3.model.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {

    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public String publishComment(Comment comment) {
        logger.info("Publishing comment " + comment.getText());
        return "SUCCESS";
    }
}
