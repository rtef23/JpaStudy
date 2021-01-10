package com.personal.jpastudy.domain2;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT")
public class Product {
  @Column(name = "name")
  private String name;

  @OneToMany(mappedBy = "product")
  private List<UserProduct> userProducts = new ArrayList<>();
//  @ManyToMany(mappedBy = "products")
//  private List<User> users = new ArrayList<>();

  public Product() {
  }
}
