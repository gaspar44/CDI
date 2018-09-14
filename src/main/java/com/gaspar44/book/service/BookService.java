package com.gaspar44.book.service;

import javax.inject.Inject;

import com.gaspar44.book.api.Generator;
import com.gaspar44.book.api.NumberGenerator;

public class BookService {
	
	@Inject
	@Generator(use = true)
	private NumberGenerator numberGenerator;
		
	public Book createBook(String title) {
		return new Book(title,numberGenerator.generateNumber());
	}
	
}
