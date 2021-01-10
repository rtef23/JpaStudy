package com.personal.jpastudy.domain;

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

  private String name;

  private String city;

  private String street;

  @Column(name = "zipcode")
  private String zipCode;

  @OneToMany(mappedBy = "member")
  private List<Order> orders = new ArrayList<>();

  public User() {}

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getCity() {
    return city;
  }

  public String getStreet() {
    return street;
  }

  public String getZipCode() {
    return zipCode;
  }

  public List<Order> getOrders() {
    return orders;
  }
}
