package com.personal.jpastudy.domain2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "LOCKER")
public class Locker {
  @Id
  @GeneratedValue
  @Column(name = "locker_id")
  private Long id;

  @Column(name = "name")
  private String name;

  @OneToOne(mappedBy = "locker")
  private User user;

  public Locker() {
  }

  public Locker(String name) {
    this.name = name;
  }
}
