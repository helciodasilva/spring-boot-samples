package com.helciodasilva.springbootsamples.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NameValidator implements ConstraintValidator<Name, String> {
  public void initialize(Name constraintAnnotation) {
  }

  public boolean isValid(String value, ConstraintValidatorContext context) {
    if ("helciodasilva".equalsIgnoreCase(value)) {
      return false;
    }
    return true;
  }
}