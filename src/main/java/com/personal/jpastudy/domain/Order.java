package com.personal.jpastudy.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ORDERS")
public class Order {
  @Id
  @GeneratedValue
  @Column(name = "order_id")
  private Long id;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;

  @Column(name = "order_date")
  private LocalDateTime orderDate;

  @Enumerated(EnumType.STRING)
  @Column(name = "order_status")
  private OrderStatus orderStatus;

  @OneToMany(mappedBy = "order")
  private List<OrderItem> orderItems = new ArrayList<>();

  public Order() {}

  public Long getId() {
    return id;
  }

  public LocalDateTime getOrderDate() {
    return orderDate;
  }

  public OrderStatus getOrderStatus() {
    return orderStatus;
  }

  public void addOrderItem(OrderItem orderItem){
    this.orderItems.add(orderItem);
    orderItem.setOrder(this);
  }

  public List<OrderItem> getOrderItems() {
    return orderItems;
  }
}
