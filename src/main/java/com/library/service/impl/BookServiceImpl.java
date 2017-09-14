package com.library.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.library.exception.LibraryException;
import com.library.model.Book;
import com.library.repository.BookRepository;
import com.library.service.BookService;

@Service
public class BookServiceImpl implements BookService{

	@Resource
	BookRepository bookRepository;
	
	
	@Override
	@Transactional
	public Book create(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public Book delete(int id) throws LibraryException {
		Book book = bookRepository.findOne(id);
		if(book == null){
			throw new LibraryException("Book not found");
		}
		bookRepository.delete(book);
		return book;
	}

	@Override
	public List<Book> findAll() {
		return bookRepository.findAll();
	}

	@Override
	@Transactional(rollbackFor=Exception.class)
	public Book update(Book book) throws LibraryException {
		Book oldBook = bookRepository.findOne(book.getBookID());
		if(oldBook == null){
			throw new LibraryException("Book Not Found");
		}
		return bookRepository.save(book);
	}

	@Override
	public Book findByID(int id) {
		return bookRepository.findOne(id);
	}

}
