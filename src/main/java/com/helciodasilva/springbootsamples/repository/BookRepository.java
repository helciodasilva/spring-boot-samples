package com.helciodasilva.springbootsamples.repository;

import org.springframework.data.repository.CrudRepository;

import com.helciodasilva.springbootsamples.model.BookEntity;

public interface BookRepository extends CrudRepository<BookEntity, Long> {

}
