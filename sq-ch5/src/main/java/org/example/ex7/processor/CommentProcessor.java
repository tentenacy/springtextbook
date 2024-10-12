package org.example.ex7.processor;

import org.example.ex7.model.Comment;
import org.example.ex7.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentProcessor {

    @Autowired
    private CommentRepository commentRepository;

    private Comment comment;

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment c) {
        this.comment = c;
    }

    public void processComment(Comment c) {
        // comment 속성을 변경한다.
    }

    public void validateComment(Comment c) {
        // comment 속성을 검사하고 변경한다.
    }
}
