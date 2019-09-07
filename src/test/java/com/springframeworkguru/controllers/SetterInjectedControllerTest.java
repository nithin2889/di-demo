package com.springframeworkguru.controllers;

import static org.junit.Assert.assertEquals;

import com.springframeworkguru.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

public class SetterInjectedControllerTest {

  private SetterInjectedController setterInjectedController;

  @Before
  public void setUp() throws Exception {
    this.setterInjectedController = new SetterInjectedController();
    this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
  }

  @Test
  public void testGreeting() throws Exception {
    assertEquals(GreetingServiceImpl.HELLO_GURUS, setterInjectedController.sayHello());
  }
}
