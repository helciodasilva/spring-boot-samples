package com.helciodasilva.springbootsamples.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user")
@Getter
@Setter
public class BookEntity {

  @Id
  @GeneratedValue
  private Long id;

  private String name;

}
