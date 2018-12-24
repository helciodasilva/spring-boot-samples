package com.helciodasilva.springbootsamples.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.helciodasilva.springbootsamples.model.BookEntity;
import com.helciodasilva.springbootsamples.service.BookService;

@RestController
@RequestMapping("/books")
public class BookRestController {

  @Autowired
  private BookService service;

  @GetMapping("/{id}")
  public BookEntity retrieveById(@PathVariable Long id) {
    return service.retrieveById(id);
  }

}
