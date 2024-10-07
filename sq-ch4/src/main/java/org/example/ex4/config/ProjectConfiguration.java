
package org.example.ex4.config;

import org.example.ex4.proxies.CommentNotificationProxy;
import org.example.ex4.proxies.EmailCommentNotificationProxy;
import org.example.ex4.repositories.CommentRepository;
import org.example.ex4.repositories.DBCommentRepository;
import org.example.ex4.services.CommentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfiguration {

    @Bean
    public CommentRepository commentRepository() {
        return new DBCommentRepository();
    }

    @Bean
    public CommentNotificationProxy commentNotificationProxy() {
        return new EmailCommentNotificationProxy();
    }

    @Bean
    public CommentService commentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy) {
        return new CommentService(commentRepository, commentNotificationProxy);
    }
}
