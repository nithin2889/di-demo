package com.springframeworkguru.services;

import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository {
  String getEnglishGreeting();

  String getSpanishGreeting();

  String getGermanGreeting();
}
