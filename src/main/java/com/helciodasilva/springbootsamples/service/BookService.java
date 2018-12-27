package com.helciodasilva.springbootsamples.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helciodasilva.springbootsamples.dto.BookDTO;
import com.helciodasilva.springbootsamples.exception.ResourceNotFoundException;
import com.helciodasilva.springbootsamples.model.BookEntity;
import com.helciodasilva.springbootsamples.repository.BookRepository;

@Service
public class BookService {

  private static final Logger LOGGER = LoggerFactory.getLogger(BookService.class);

  @Autowired
  private BookRepository repository;

  public BookEntity retrieveById(Long id) {
    LOGGER.info("Execute retrieve by id={}", id);
    Optional<BookEntity> book = repository.findById(id);

    if (!book.isPresent()) {
      throw new ResourceNotFoundException(id, "user not found");
    }
    return book.get();
  }

  public void create(BookDTO bookDTO) {
    LOGGER.info("Execute create bookDTO={}", bookDTO);
  }

}
