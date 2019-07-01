package com.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.ProductRepository;
import com.app.model.Product;
import com.app.service.IProductService;
@Service
public class ProductServiceImpl implements IProductService {
	@Autowired
	private ProductRepository repo;

	@Transactional
	public Product saveData(Product p) {
		// TODO Auto-generated method stub
		Product p1=repo.save(p);
		return p1;
	}

	@Transactional(readOnly= true)
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		List<Product> l=repo.findAll();
		return l;
	}

	@Transactional
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		Product p=new Product();
		p.setId(id);
		repo.delete(p);
	}

	@Transactional(readOnly = true)
	public Optional<Product> getProductById(Integer id) {
		Product p=new Product();
		p.setId(id);
		
		return repo.findById(id);
	}

	
}
