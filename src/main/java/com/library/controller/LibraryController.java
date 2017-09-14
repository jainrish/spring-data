package com.library.controller;

import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.library.model.Book;
import com.library.service.BookService;

@Controller
@RequestMapping(value="/library")
public class LibraryController {

	@Autowired
	private BookService bookService;
	
	@Produces("application/json")
	@RequestMapping(value="/book/create", method = RequestMethod.POST)
	public Book createBook(@ModelAttribute Book book){
		return bookService.create(book);
	}
	
	@Produces("application/json")
	@RequestMapping(value="/book/getByID/{id}", method = RequestMethod.GET)
	public Book getBook(@PathVariable int id){
		return bookService.findByID(id);
	}
}
