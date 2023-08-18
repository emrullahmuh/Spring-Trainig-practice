package cydeo.cydeo.Module.Service;

import cydeo.cydeo.Module.Repository.CommentRepository;
import cydeo.cydeo.Module.Module.Comment;
import cydeo.cydeo.Module.Proxy.CommentNotificationProxy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

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
