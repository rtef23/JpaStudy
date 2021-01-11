package com.personal.jpastudy.domain4;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Movie extends CreateInfo {
  @Id
  @GeneratedValue
  private Long id;

  private LocalDateTime openDateTime;
}
