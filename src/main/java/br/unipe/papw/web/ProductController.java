package br.unipe.papw.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.unipe.papw.model.Product;
import br.unipe.papw.service.ProductService;
import br.unipe.papw.validator.ProductValidator;


@Controller
public class ProductController {
	
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private ProductValidator productValidator;
	
	/**
	 */
	@GetMapping("/product")
	public String listProduct(Model model) {
				
		List<Product> listProduct = productService.findAll();
		System.out.println(listProduct.get(0).getName());
		model.addAttribute("listProduct",listProduct);
		
		return "module/product/index";
	}

	
	@GetMapping("/product/form")
	public String prepareProductForm(Model model) {
		Product produto = new Product();
		model.addAttribute("productForm",produto);		
		return "module/product/formProduct";
	}
	
	@PostMapping("/product")
	public String save(@ModelAttribute("productForm") Product product, BindingResult bindingResult) {
		 if (bindingResult.hasErrors()) {
	            return "module/product/productForm";
	        }
		 productService.save(product);

		 
		return "module/product/index";
	}
	
	

}
