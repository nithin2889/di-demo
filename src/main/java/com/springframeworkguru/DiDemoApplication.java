package com.springframeworkguru;

import com.springframeworkguru.controllers.ConstructorInjectedController;
import com.springframeworkguru.controllers.MyController;
import com.springframeworkguru.controllers.PropertyInjectedController;
import com.springframeworkguru.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

  public static void main(String[] args) {
    ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
    System.out.println(ctx.getBean(MyController.class).hello());
    System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
    System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
    System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
  }
}
