package com.shruti.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.shruti.bindings.ProductB;
import com.shruti.entity.ProductE;
import com.shruti.repo.ProductRepository;

@Controller
public class ProductController {

	@Autowired
	ProductRepository prepo;
	// Method to load empty form 
	
	
	@GetMapping("/")
	public String loadForm(Model model) {
		
		model.addAttribute("product", new ProductE());
		return "index";
	}

	
	
	//Method to store product data
	
	@PostMapping("/saveProduct")
	public String saveProductData(Model model, ProductB pb) {
		
		
		ProductE pe = new ProductE();
		BeanUtils.copyProperties(pb, pe);
		
		model.addAttribute("product",pb);
		System.out.println(pe);
		
		prepo.save(pe);
		model.addAttribute("msg","Product Details Saved");
		
		return "index";
		
	}
	
	
}
