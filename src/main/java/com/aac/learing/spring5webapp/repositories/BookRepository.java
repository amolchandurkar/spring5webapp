package com.aac.learing.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.aac.learing.spring5webapp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}