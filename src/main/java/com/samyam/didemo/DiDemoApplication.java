package com.samyam.didemo;

import com.samyam.didemo.controllers.ConstructorInjectedController;
import com.samyam.didemo.controllers.MyController;
import com.samyam.didemo.controllers.PropertyInjectedController;
import com.samyam.didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {


		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);


		MyController controller = (MyController) ctx.getBean("myController"); //springboot defines the beans in camelcase.

		System.out.println(controller.Hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());

	}
}
