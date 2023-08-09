package org.cydeo.Service;

import org.cydeo.Module.Comment;
import org.cydeo.Proxy.CommentNotificationProxy;
import org.cydeo.Repository.CommentRepository;
import org.cydeo.config.Appconfig;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CommentService {
    private final CommentRepository commentRepository;
    private final  CommentNotificationProxy commentNotificationProxy;
 private final Appconfig appconfigdata;

    public CommentService(CommentRepository commentRepository, @Qualifier("EMAIL") CommentNotificationProxy commentNotificationProxy, Appconfig appconfigdata) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
        this.appconfigdata = appconfigdata;
    }

    public void publishComment(Comment comment){
        //save in the data
commentRepository.storeComment(comment);
        //send email
      commentNotificationProxy.sentComment(comment);
    }

    public void printConfigData(){
    /* Appconfig app=new Appconfig();
        String username= app.getUsername();
        String password= app.getPassword();
        String url= app.getUrl();
        System.out.println(username+" - "+password+" - "+url);*/
        System.out.println(appconfigdata.getUsername());
        System.out.println(appconfigdata.getPassword());
        System.out.println(appconfigdata.getUrl());
    }


}
