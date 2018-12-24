package com.helciodasilva.springbootsamples.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helciodasilva.springbootsamples.model.BookEntity;

public interface BookRepository extends JpaRepository<BookEntity, Long> {

}
