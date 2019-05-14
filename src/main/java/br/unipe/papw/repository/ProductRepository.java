package br.unipe.papw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.unipe.papw.model.Product;

@Repository
public interface ProductRepository
      extends JpaRepository<Product, Long>{
	
	Product findByName(String nome);
	
}




