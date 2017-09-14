package com.library.service;

import java.util.List;

import com.library.exception.LibraryException;
import com.library.model.Book;

public interface BookService {
	
	public Book create(Book book);
	public Book delete(int id) throws LibraryException;
	public List<Book> findAll();
	public Book update(Book book) throws LibraryException;
	public Book findByID(int id);

}
