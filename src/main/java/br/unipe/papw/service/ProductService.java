package br.unipe.papw.service;

import java.util.List;

import br.unipe.papw.model.Product;

public interface ProductService {

	void save(Product produto);
	Product findByName(String nome);
	List<Product> findAll();
	
}
