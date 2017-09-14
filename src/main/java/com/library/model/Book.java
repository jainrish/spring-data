package com.library.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Book", schema="rjoltp")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Integer bookID;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "author")
	private String author;
	
	@Column(name = "pages")
	private Integer pages;
	
	@Column(name = "LIBRARY_ID")
	private Integer libraryID;

	public Integer getBookID() {
		return bookID;
	}

	public void setBookID(Integer bookID) {
		this.bookID = bookID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public Integer getLibraryID() {
		return libraryID;
	}

	public void setLibraryID(Integer libraryID) {
		this.libraryID = libraryID;
	}
	
}
