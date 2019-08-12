package com.en.ws.repositories;

import java.util.List;

import com.en.ws.entities.Product;
import com.en.ws.enums.CAT;

public interface ProductRepository {
	
	boolean create(Product product);
	
	List<Product> list();
	
	List<Product> search(Integer code, String name, CAT category);
	
	boolean modify(Integer code);
	
	boolean delete(Integer code);
	
	boolean sell(Integer code, Integer num);
	
	void infoSells();
	
}
