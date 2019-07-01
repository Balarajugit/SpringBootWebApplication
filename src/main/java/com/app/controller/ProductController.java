package com.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Product;
import com.app.service.IProductService;

@Controller
public class ProductController {
	@Autowired
	private IProductService service;
	@RequestMapping(value = "/reg",method = RequestMethod.GET)
	public String register(Model map) {
		map.addAttribute("product", new Product());
		return "Register";
	}
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public String saveData(@ModelAttribute Product product,Model map) {
		service.saveData(product);
		map.addAttribute("message", "data inserted sucessfully");
		map.addAttribute("product", new Product());
		return "Register";
	}
	@RequestMapping("/get")
	public String getDetailsAll(Model map) {
		List<Product> op=service.getAll();
		map.addAttribute("list", op);
		
		return "Data";
	}
	@RequestMapping("/delete")
	public String delete(@RequestParam Integer id) {
		service.delete(id);
		
		return "redirect:get";
	}
	@RequestMapping("/edit")
	public String editRecord(@RequestParam Integer id,Model map) {
		Optional<Product> p=service.getProductById(id);
		map.addAttribute("product", p);
		map.addAttribute("mode", "edit");
		
		return "Register";
	}
	

}
