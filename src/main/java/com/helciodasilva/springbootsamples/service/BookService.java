package com.helciodasilva.springbootsamples.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helciodasilva.springbootsamples.dto.BookDTO;
import com.helciodasilva.springbootsamples.exception.ResourceNotFoundException;
import com.helciodasilva.springbootsamples.model.BookEntity;
import com.helciodasilva.springbootsamples.repository.BookRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BookService {

  @Autowired
  private BookRepository repository;

  public BookEntity retrieveById(Long id) {
    log.debug("Execute retrieve by id={}", id);
    Optional<BookEntity> book = repository.findById(id);

    if (!book.isPresent()) {
      throw new ResourceNotFoundException(id, "user not found");
    }
    return book.get();
  }

  public void create(BookDTO dto) {
    log.debug("Execute create bookDTO={}", bookDTO);
    BookEntity entity = new BookEntity();
    entity.setName(dto.getName());
    repository.save(entity);
  }

}
