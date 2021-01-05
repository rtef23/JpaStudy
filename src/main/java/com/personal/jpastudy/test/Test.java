package com.personal.jpastudy.test;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "test")
@SequenceGenerator(name = "testSequenceGenerator", sequenceName = "TEST_SEQ", initialValue = 1, allocationSize = 100)
public class Test {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "testSequenceGenerator")
  private Long id;

  private String name;

  public void setName(String name) {
    this.name = name;
  }
}
