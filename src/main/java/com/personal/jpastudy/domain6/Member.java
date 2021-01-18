package com.personal.jpastudy.domain6;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "team_id")
  private Team team;

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Team getTeam() {
    return team;
  }

  public void setTeam(Team team) {
    this.team = team;
  }
}
