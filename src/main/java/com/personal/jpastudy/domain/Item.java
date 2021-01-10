package com.personal.jpastudy.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ITEM")
public class Item {
  @Id
  @GeneratedValue
  @Column(name = "item_id")
  private Long id;

  private int price;

  @Column(name = "stock_quantity")
  private int stockQuantity;

  public Item() {
  }

  public Long getId() {
    return id;
  }

  public int getPrice() {
    return price;
  }

  public int getStockQuantity() {
    return stockQuantity;
  }
}
