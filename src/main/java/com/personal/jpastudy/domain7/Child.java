package com.personal.jpastudy.domain7;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Child {
  @Id
  @GeneratedValue
  @Column(name = "child_id")
  private Long id;

  private String name;

  @ManyToOne
  @JoinColumn(name = "parent_id")
  private Parent parent;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Parent getParent() {
    return parent;
  }

  public void setParent(Parent parent) {
    this.parent = parent;
  }
}
