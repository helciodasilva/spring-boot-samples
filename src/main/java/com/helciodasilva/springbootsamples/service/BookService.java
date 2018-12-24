package com.helciodasilva.springbootsamples.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helciodasilva.springbootsamples.exception.ResourceNotFoundException;
import com.helciodasilva.springbootsamples.model.BookEntity;
import com.helciodasilva.springbootsamples.repository.BookRepository;

@Service
public class BookService {

  @Autowired
  private BookRepository repository;

  public BookEntity retrieveById(Long id) {
    Optional<BookEntity> book = repository.findById(id);

    if (!book.isPresent()) {
      throw new ResourceNotFoundException(id, "user not found");
    }
    return book.get();
  }

}
