package com.personal.jpastudy.domain5;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Member {
  @Id
  @GeneratedValue
  @Column(name = "member_id")
  private Long id;

  private String name;

  @ManyToOne
  @JoinColumn(name = "team_id")
  private Team team;

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Team getTeam() {
    return team;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setTeam(Team team) {
    this.team = team;
  }
}
