package org.cydeo;

import org.cydeo.Config.comConfig;
import org.cydeo.Module.Comment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class CommentApp {
    public static void main(String[] args) {
Comment comment=new Comment();
comment.setName("john");
comment.setText("spring test");

        ApplicationContext container=new AnnotationConfigApplicationContext(comConfig.class);
/*
 CommentService commentService=container.getBean(CommentService.class);
commentService.publishComment(comment);
*/
    }
}
