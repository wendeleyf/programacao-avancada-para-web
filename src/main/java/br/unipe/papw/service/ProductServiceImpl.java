package br.unipe.papw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unipe.papw.model.Product;
import br.unipe.papw.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	public void save(Product produto) {
		productRepository.save(produto);
	}

	public Product findByName(String nome) {
		return productRepository.findByName(nome);
	}
	
	
	public List<Product> findAll(){
		return productRepository.findAll();
	}

}
