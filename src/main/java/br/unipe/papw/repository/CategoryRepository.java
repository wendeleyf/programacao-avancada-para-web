package br.unipe.papw.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.unipe.papw.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
