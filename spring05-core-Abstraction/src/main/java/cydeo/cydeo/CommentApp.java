package cydeo.cydeo;

import cydeo.cydeo.Config.comConfig;
import cydeo.cydeo.Module.Comment;
import cydeo.cydeo.Service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CommentApp {
    public static void main(String[] args) {
Comment comment=new Comment();
comment.setName("john");
comment.setText("spring test");

        ApplicationContext container=new AnnotationConfigApplicationContext(comConfig.class);

 CommentService commentService=container.getBean(CommentService.class);
commentService.publishComment(comment);

    }
}
