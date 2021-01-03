package com.personal.jpastudy.member;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "member")
public class Member {
  @Id private Long id;

  @Column(name = "name")
  private String userName;

  private Integer age;

  @Enumerated(EnumType.STRING)
  private RoleType roleType;

  //    @Temporal(TemporalType.TIMESTAMP)
  //  private Date createDate;

  private LocalDate createDate;

  //  @Temporal(TemporalType.TIMESTAMP)
  //  private Date lastModifyDate;

  private LocalDate lastModifyDate;

  @Lob private String description;

  @Column(columnDefinition = "varchar(100) default 'TEST_VALUE'")
  private String test1;

  @Transient private String temp;

  public Member() {}

  public Member(
      Long id,
      String userName,
      Integer age,
      RoleType roleType,
      LocalDate createDate,
      LocalDate lastModifyDate,
      String description) {
    this.id = id;
    this.userName = userName;
    this.age = age;
    this.roleType = roleType;
    this.createDate = createDate;
    this.lastModifyDate = lastModifyDate;
    this.description = description;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public RoleType getRoleType() {
    return roleType;
  }

  public void setRoleType(RoleType roleType) {
    this.roleType = roleType;
  }

  public LocalDate getCreateDate() {
    return createDate;
  }

  public void setCreateDate(LocalDate createDate) {
    this.createDate = createDate;
  }

  public LocalDate getLastModifyDate() {
    return lastModifyDate;
  }

  public void setLastModifyDate(LocalDate lastModifyDate) {
    this.lastModifyDate = lastModifyDate;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return "Member{"
        + "id="
        + id
        + ", userName='"
        + userName
        + '\''
        + ", age="
        + age
        + ", roleType="
        + roleType
        + ", createDate="
        + createDate
        + ", lastModifyDate="
        + lastModifyDate
        + ", description='"
        + description
        + '\''
        + '}';
  }
}
