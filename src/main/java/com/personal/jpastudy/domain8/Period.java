package com.personal.jpastudy.domain8;

import java.time.LocalDate;
import javax.persistence.Embeddable;

@Embeddable
public class Period {
  private LocalDate startDate;
  private LocalDate endDate;

  public Period() {
  }

  public Period(LocalDate startDate, LocalDate endDate) {
    this.startDate = startDate;
    this.endDate = endDate;
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }
}
