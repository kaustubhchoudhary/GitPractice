package com.example.repo;

import com.example.entities.Product;
import java.util.Arrays;

public class ProductsUpdate {

	public static Product[] updatePrice() {

		Product[] products = new Product[5];

		products[0] = new Product(101, "TV", 20000, 4, true);
		products[1] = new Product(102, "Watch", 5000, 5, false);
		products[2] = new Product(103, "Mobile", 22000, 4, true);
		products[3] = new Product(104, "Fridge", 25000, 3, true);
		products[4] = new Product(105, "Oven", 12000, 2, false);

		// Apply a 25% discount to all products
        Arrays.stream(products)
              .forEach(product -> product.setPrice(product.getPrice() * 0.75));
		
		return products;

	}
}
