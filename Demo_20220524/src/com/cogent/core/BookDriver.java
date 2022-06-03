package com.cogent.core;

public class BookDriver {
	public static void main(String[] args) {
		
		Book book = new Book();
		
		book.setTitle("Harry Potter and the Goblet of Fire");
		book.setAuthor("J.K Rowling");
		book.setPages(636);
		book.setPrice(22.96);
		book.setCategory("Fiction");
		
		System.out.println("Name of the book is " + book.getTitle() + "\n" +
							"Author of the book is " + book.getAuthor() + "\n" +
							"Number of pages in the book is " + book.getPages() + "\n" +
							"Price of the book is $" + book.getPrice() + "\n" +
							"Category of the book is " + book.getCategory());
		
		
		System.out.println(book);
		
		
	}
}
