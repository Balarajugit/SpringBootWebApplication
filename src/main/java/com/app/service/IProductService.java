package com.app.service;

import java.util.List;
import java.util.Optional;

import com.app.model.Product;

public interface IProductService {
	public Product saveData(Product p);
	public List<Product> getAll();
	public void delete(Integer id);
	public Optional<Product> getProductById(Integer id);

}
