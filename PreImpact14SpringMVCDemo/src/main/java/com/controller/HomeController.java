package com.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



import com.dao.ProductDaoImpl;
import com.model.Product;




@Controller
public class HomeController {
	static ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguratition.class);
	static ProductDaoImpl pDao=context.getBean("pDao", ProductDaoImpl.class);
	
	@RequestMapping("/home")
	public String getHomePage() {
		
		return "home";
		
	}
	
	@RequestMapping("/addProduct")
	public String addProduct() {
		return "addProduct";
	}
	
	@RequestMapping("/added")
	public String insertProduct(@RequestParam("pid") int pid,@RequestParam("pname") String pname, @RequestParam("pprice")float pprice) {
		System.out.println(pid);
		System.out.println(pname);
		System.out.println(pprice);
		Product prod = new Product();
		prod.setPid(pid);
		prod.setPname(pname);
		prod.setPprice(pprice);
		pDao.insertProduct(prod);
		return "addMessage";
	}
	
	@RequestMapping("/products")
	public ModelAndView getProducts(ModelAndView mv) {
		List<Product> products =pDao.getAllProduct();
		mv.addObject("products",products);
		mv.setViewName("products");
		return mv;
	}
	
	@RequestMapping("/update")
	public String updateProduct() {
		return "update";
	}
	
	@RequestMapping("/updateSuccess")
	public String updateSuccess(@ModelAttribute Product product) {
		pDao.updateProduct(product);
		return "updateSuc";
	}

}