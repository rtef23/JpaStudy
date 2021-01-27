package com.personal.jpastudy.domain10;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Member {
  @Id @GeneratedValue private Long id;

  private String username;

  private int age;

  @ManyToOne
  @JoinColumn(name = "team_id")
  private Team team;

  public Member(String username, int age) {
    this.username = username;
    this.age = age;
  }

  public Member() {
  }

  public Long getId() {
    return id;
  }

  public String getUsername() {
    return username;
  }

  public int getAge() {
    return age;
  }

  public Team getTeam() {
    return team;
  }

  @Override
  public String toString() {
    return "Member{" +
        "id=" + id +
        ", username='" + username + '\'' +
        ", age=" + age +
        '}';
  }
}
