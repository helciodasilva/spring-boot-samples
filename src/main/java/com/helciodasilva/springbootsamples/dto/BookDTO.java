package com.helciodasilva.springbootsamples.dto;

import javax.validation.constraints.NotBlank;

import com.helciodasilva.springbootsamples.validators.Name;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookDTO {

  @Name(message = "Invalid username.")
  @NotBlank(message = "name can not be null.")
  private String name;

}
