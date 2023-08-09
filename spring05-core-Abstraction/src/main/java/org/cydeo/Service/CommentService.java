package org.cydeo.Service;

import org.cydeo.Module.Comment;
import org.cydeo.Proxy.CommentNotificationProxy;
import org.cydeo.Proxy.EmailCommentNotificationProxy;
import org.cydeo.Repository.CommentRepository;
import org.cydeo.Repository.DBCommentRepostory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CommentService {
    private final CommentRepository commentRepository;
    private final  CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository, @Qualifier("EMAIL") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment){
        //save in the data
commentRepository.storeComment(comment);
        //send email
      commentNotificationProxy.sentComment(comment);
    }
}
