package com.example.entities;

public class Product {
	private int id;
	private String name;
	private double price;
	private int rating;
	private boolean inStock;

	public Product() {
		super();
	}

	public Product(int id, String name, double price, int rating, boolean inStock) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.rating = rating;
		this.inStock = inStock;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public boolean isInStock() {
		return inStock;
	}

	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}

	@Override
	public String toString() {
		return "\n Product [id=" + id + ", name=" + name + ", price=" + price + ", rating=" + rating + ", inStock="
				+ inStock + "]";
	}

}
