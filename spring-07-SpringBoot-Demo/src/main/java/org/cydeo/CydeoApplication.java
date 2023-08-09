package org.cydeo;

import org.cydeo.Module.Comment;

import org.cydeo.Service.CommentService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class CydeoApplication {

	public static void main(String[] args) {
		Comment commen=new Comment();
		commen.setName("john");
		commen.setText("spring test");

		ApplicationContext container=new AnnotationConfigApplicationContext(CydeoApplication.class);

		CommentService commentService =container.getBean(CommentService.class);
				commentService.publishComment(commen);

				commentService.printConfigData();
	}

}


