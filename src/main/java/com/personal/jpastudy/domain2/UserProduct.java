package com.personal.jpastudy.domain2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "User_Product")
public class UserProduct {
  @Id @GeneratedValue private Long id;

  @ManyToOne
  @JoinColumn(name = "member_id")
  private User user;

  @ManyToOne
  @JoinColumn(name = "product_id")
  private Product product;
}
