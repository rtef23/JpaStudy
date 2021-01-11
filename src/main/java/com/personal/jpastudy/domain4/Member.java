package com.personal.jpastudy.domain4;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Member extends CreateInfo {
  @Id
  @GeneratedValue
  private Long id;

  private String name;
  private int age;
}
