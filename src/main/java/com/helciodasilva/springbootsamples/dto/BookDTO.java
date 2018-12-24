package com.helciodasilva.springbootsamples.dto;

import javax.validation.constraints.NotBlank;

public class BookDTO {

  @NotBlank(message = "name can not be null.")
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
