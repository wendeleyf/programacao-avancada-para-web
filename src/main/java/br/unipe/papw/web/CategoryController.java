package br.unipe.papw.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.unipe.papw.model.Category;
import br.unipe.papw.model.Product;
import br.unipe.papw.service.CategoryService;

@Controller
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/category")
	public String listCategory(Model model) {
		List<Category> listCategory = categoryService.findAll();
		System.out.println(listCategory.get(0).getName());
		model.addAttribute("listCategory", listCategory);
		return "module/category/index";
	}
	
	@GetMapping("/category/form")
	public String prepareCategoryForm(Model model) {
		Category category = new Category();
		model.addAttribute("categoryForm", category);
		return "module/category/formCategory";
	}
	
	@PostMapping("/category")
	public String save(@ModelAttribute("categoryForm") Category category, BindingResult bindingResult) {
		 
		if (bindingResult.hasErrors()) {
	        return "module/category/categoryForm";
	     }
		
		 categoryService.save(category);
		 return "module/category/index";
	}

}
