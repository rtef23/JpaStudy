package com.personal.jpastudy.domain4;

import java.time.LocalDateTime;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class CreateInfo {
  private String creator;
  private LocalDateTime createDateTime;
}
