package com.oned.bookstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oned.bookstore.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
