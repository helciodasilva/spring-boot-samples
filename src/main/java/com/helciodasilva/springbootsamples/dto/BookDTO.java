package com.helciodasilva.springbootsamples.dto;

import javax.validation.constraints.NotBlank;

import com.helciodasilva.springbootsamples.validators.Name;

public class BookDTO {

  @Name(message = "Invalid username.")
  @NotBlank(message = "name can not be null.")
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
