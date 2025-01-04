package com.example;

import com.example.entities.Product;

public class Main {

	public static void main(String[] args) {
		System.out.println("\n Hello Git");
		
		Product product = new Product(101, "TV");
		
		System.out.println(product);
	}

}
