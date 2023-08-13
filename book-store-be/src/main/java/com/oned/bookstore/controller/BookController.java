package com.oned.bookstore.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oned.bookstore.dao.BookRepository;
import com.oned.bookstore.model.Book;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/books")
public class BookController {
	
	Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private BookRepository bookRepository;
	
	@GetMapping({"","/"})
	public List<Book> getBooks() {
		LOGGER.info("request received GET getBooks()");
		return bookRepository.findAll();
	}
	
	@GetMapping(path = { "/{id}" })
	public Book getBookById(@PathVariable("id") long id) {
		LOGGER.info("request received GET getBookById({})",id);
		Book book = bookRepository.getById(id);
		return book;
	}
	
	@PostMapping("/")
	public void createBook(@RequestBody Book book) {
		LOGGER.info("request received createBook({})",book);
		bookRepository.save(book);
	}
	
	@DeleteMapping(path = { "/{id}" })
	public Book deleteBook(@PathVariable("id") long id) {
		LOGGER.info("request received deleteBook({})",id);
		Book book = bookRepository.getOne(id);
		bookRepository.deleteById(id);
		return book;
	}

}
