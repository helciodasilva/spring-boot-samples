package com.helciodasilva.springbootsamples.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
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
  
  @Cacheable(value = "book", key = "#userId", condition = "#userId != null")
  public BookEntity retrieveById(Long userId) {
    log.debug("Execute retrieve by id={}", userId);
    Optional<BookEntity> book = repository.findById(userId);

    if (!book.isPresent()) {
      throw new ResourceNotFoundException(userId, "user not found");
    }
    return book.get();
  }
  
  @CacheEvict(value = "book", key = "#userId")
  public void resetOnSurname(String userId) {
  }

  @CacheEvict(value = "book", allEntries = true)
  public void resetAllEntries() {
  }

  public void create(BookDTO dto) {
    log.debug("Execute create bookDTO={}", bookDTO);
    BookEntity entity = new BookEntity();
    entity.setName(dto.getName());
    repository.save(entity);
  }

}
