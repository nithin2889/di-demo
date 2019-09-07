package com.springframeworkguru.controllers;

import static org.junit.Assert.assertEquals;

import com.springframeworkguru.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

public class ConstructorInjectedControllerTest {

  private ConstructorInjectedController constructorInjectedController;

  @Before
  public void setUp() throws Exception {
    this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
  }

  @Test
  public void testGreeting() throws Exception {
    assertEquals(GreetingServiceImpl.HELLO_GURUS, constructorInjectedController.sayHello());
  }
}
