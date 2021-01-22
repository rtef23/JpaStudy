package com.personal.jpastudy.domain9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Member {
  @Id
  @GeneratedValue
  @Column(name = "member_id")
  private Long id;

  private String name;

  @ElementCollection
  @CollectionTable(name = "FAVORITE_FOOD", joinColumns = @JoinColumn(name = "member_id"))
  @Column(name = "food_name")
  private Set<String> favoriteFoods = new HashSet<>();

//  @ElementCollection
//  @CollectionTable(name = "ADDRESS", joinColumns = @JoinColumn(name = "member_id"))
//  private List<Address> addressHistory = new ArrayList<>();

  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "member_id")
  private List<AddressEntity> addressHistory = new ArrayList<>();

  public Long getId() {
    return id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setFavoriteFoods(Set<String> favoriteFoods) {
    this.favoriteFoods = favoriteFoods;
  }

  public Set<String> getFavoriteFoods() {
    return favoriteFoods;
  }

//  public void setAddressHistory(List<Address> addressHistory) {
//    this.addressHistory = addressHistory;
//  }
//
//  public List<Address> getAddressHistory() {
//    return addressHistory;
//  }


  public List<AddressEntity> getAddressHistory() {
    return addressHistory;
  }

  public void setAddressHistory(List<AddressEntity> addressHistory) {
    this.addressHistory = addressHistory;
  }
}
