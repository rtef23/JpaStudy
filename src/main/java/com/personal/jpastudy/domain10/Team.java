package com.personal.jpastudy.domain10;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Team {
  @Id
  @GeneratedValue
  private Long id;

  private String name;

  @OneToMany(mappedBy = "team")
  private List<Member> members = new ArrayList<>();

  public Team(String name, List<Member> members) {
    this.name = name;
    this.members = members;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public List<Member> getMembers() {
    return members;
  }
}
