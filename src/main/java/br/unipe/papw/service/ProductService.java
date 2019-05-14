package br.unipe.papw.service;

import java.util.List;

import br.unipe.papw.model.Product;

public interface ProductService {

	void save(Product produto);
	void update(Product produto);
	void delete(Product produto);
	Product findByName(String nome);
	Product findById(int id);
	List<Product> findAll();
	
}
