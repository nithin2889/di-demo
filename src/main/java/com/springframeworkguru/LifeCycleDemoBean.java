package com.springframeworkguru;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemoBean
    implements InitializingBean,
        DisposableBean,
        BeanNameAware,
        BeanFactoryAware,
        ApplicationContextAware {

  public LifeCycleDemoBean() {
    System.out.println("## I'm in the LifeCycleDemoBean constructor");
  }

  @Override
  public void setBeanName(String name) {
    System.out.println("## My bean name is: " + name);
  }

  @Override
  public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
    System.out.println("## Bean Factory has been set");
  }

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    System.out.println("## Application Context has been set");
  }

  public void beforeInit() {
    System.out.println("## Before Init - called by bean post processor");
  }

  @PostConstruct
  public void postConstruct() {
    System.out.println("## The post construct annotated method has been called");
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    System.out.println("## The LifeCycleDemoBean has its properties set");
  }

  public void afterInit() {
    System.out.println("## After Init - called by bean post processor");
  }

  @PreDestroy
  public void preDestroy() {
    System.out.println("## The pre destroy annotated method has been called");
  }

  @Override
  public void destroy() throws Exception {
    System.out.println("## The LifeCycleDemoBean has been terminated");
  }
}
