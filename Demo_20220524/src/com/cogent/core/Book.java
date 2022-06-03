package com.cogent.core;

/*
 * BEAN CLASS - Features
 * All attributes are declared as private
 * Provides setters and getters for all attributes
 * Provide one public constructor
 */

public class Book {
	
	//members
	private String title;
	private String author;
	private int pages;
	private double price;
	private String category;
	
	
	
	//getters
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}

	public int getPages() {
		return pages;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getCategory() {
		return category;
	}
	
	//setters
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setPages(int pages) {
		if (pages > 0)
			this.pages = pages;
	}
	
	public void setPrice(double price) {
		if (price > 0.0)
			this.price = price;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", pages=" + pages + ", price=" + price + ", category="
				+ category + "]";
	}
	
	
}
