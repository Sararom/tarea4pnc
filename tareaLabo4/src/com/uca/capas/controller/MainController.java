package com.uca.capas.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Product;

@Controller
public class MainController {
	
	@RequestMapping ("/")
	public ModelAndView initMain() {
		ModelAndView mav = new ModelAndView();
		Product producto=new Product();
		mav.addObject("message","Bienvenido a MVC");
		mav.addObject("product",producto);
		mav.setViewName("Main");
		return mav;
	}
	
	@RequestMapping("/formData")
	public ModelAndView form(@Valid @ModelAttribute Product product,BindingResult result) {
		ModelAndView mav=new ModelAndView();
		if(result.hasErrors()) {
			mav.setViewName("Main");
		}
		else {
			mav.addObject("message","El producto ha sido agregado exitosamente");
			mav.setViewName("add");
		}
		return mav;
	}
	
	
}