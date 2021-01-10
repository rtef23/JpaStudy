package com.personal.jpastudy.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ORDER_ITEM")
public class OrderItem {
  @Id
  @GeneratedValue
  @Column(name = "order_item_id")
  private Long id;

  @ManyToOne
  @JoinColumn(name = "order_id")
  private Order order;

  @ManyToOne
  @JoinColumn(name = "item_id")
  private Item item;

  @Column(name = "order_price")
  private int orderPrice;

  public OrderItem() {}

  public Long getId() {
    return id;
  }

  public int getOrderPrice() {
    return orderPrice;
  }

  public void setOrder(Order order) {
    this.order = order;
  }
}
