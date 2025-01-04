package com.example.repo;

import com.example.entities.Product;

public class ProductRepo {

	Product[] returnProducts() {

		return new Product[] { new Product(101, "TV"), new Product(102, "Phone") };

	}
}
