package com.personal.jpastudy.domain2;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TEAM")
public class Team {
  @Id
  @GeneratedValue
  @Column(name = "team_id")
  private Long id;

  @Column(name = "name")
  private String name;

  @OneToMany
  @JoinColumn(name = "user_id")
  private List<User> users = new ArrayList<>();

  public Team() {}

  public Team(String name) {
    this.name = name;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void addUser(User user) {
    this.users.add(user);
  }
}
