package com.cydeo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.aop.AopAutoConfiguration;



//when you run the application on the consol you can see( Tomcat started on port(s): 49261) ,if you open a browse ant type localhost:49261 ,you can see a webb site







@SpringBootApplication




//@SpringBootApplication(exclude = {AopAutoConfiguration.class})
public class CydeoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CydeoApplication.class, args);
	}

}
