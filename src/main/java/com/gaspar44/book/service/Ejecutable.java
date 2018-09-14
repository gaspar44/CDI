package com.gaspar44.book.service;

public class Ejecutable {
	public static void main(String[] args) {
		BookService service = new BookService();
		Book book = service.createBook("holis");
		System.out.println(book.IDnumber);
	}
}
