package com.samyam.didemo;

import com.samyam.didemo.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {


		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);


		MyController controller = (MyController) ctx.getBean("myController"); //springboot defines the beans in camelcase.
		System.out.println(controller.Hello());
	}
}
