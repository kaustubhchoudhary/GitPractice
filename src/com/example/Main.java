package com.example;

import com.example.entities.Product;
import com.example.repo.ProductRepo;

public class Main {

	public static void main(String[] args) {
		System.out.println("\n Hello Git");
		Product[] products = ProductRepo.returnProducts();
		System.out.println(products);
	}

}
