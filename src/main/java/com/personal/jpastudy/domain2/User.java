package com.personal.jpastudy.domain2;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class User {
  @Id
  @GeneratedValue
  @Column(name = "user_id")
  private Long id;

  @Column(name = "username")
  private String username;

  @OneToMany(mappedBy = "user")
  private List<UserProduct> userProducts = new ArrayList<>();

//  @ManyToMany
//  @JoinTable(name = "User_Product")
//  private List<Product> products = new ArrayList<>();

//  @OneToOne
//  @JoinColumn(name = "locker_id")
//  private Locker locker;

//  @ManyToOne
//  @JoinColumn(name = "team_id", insertable = false, updatable = false)
//  private Team team;

  public User() {}

  public User(Team team, String username) {
    this.username = username;
  }

  public Long getId() {
    return id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username){
    this.username = username;
  }

//  public void setLocker(Locker locker){
//    this.locker = locker;
//  }
}
