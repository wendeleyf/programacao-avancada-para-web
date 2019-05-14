package br.unipe.papw.service;

import java.util.List;

import br.unipe.papw.model.Category;

public interface CategoryService {

	void save(Category category);
	List<Category> findAll();
}
