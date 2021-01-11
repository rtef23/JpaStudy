package com.personal.jpastudy.domain3.each;

import javax.persistence.Entity;

@Entity
public class Book extends Item {
  private String author;
  private String isbn;
}
