package com.en.ws.repositories;

import java.util.List;
import java.util.ArrayList;

import com.en.ws.entities.Product;
import com.en.ws.enums.CAT;

public class ProductRepositoryImpl implements ProductRepository {
	
	private List<Product> products;
	
	public ProductRepositoryImpl() {
		this.products = new ArrayList<Product>();
	}

	public boolean create(Product product) {
		
		if (product == null) {
			return false;
		}
		
		products.add(product);
		return true;
		
	}

	public List<Product> list() {

		List<Product> allProducts = new ArrayList<Product>();
		
		for (Product product : this.products) {
			allProducts.add(product);
		}
		
		return allProducts;
		
	}

	public List<Product> search(Integer code, String name, CAT category) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean modify(Integer code) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(Integer code) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean sell(Integer code, Integer num) {
		// TODO Auto-generated method stub
		return false;
	}

	public void infoSells() {
		// TODO Auto-generated method stub
		
	}
	
	public List<Product> readAndSave() {
		return products;
	}
	
}
