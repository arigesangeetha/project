package com.niit.Backend;


import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.Backend.dao.ProductDAO;
import com.niit.Backend.model.Product;

public class ProductTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.Backend");
		context.refresh();

		ProductDAO productDAO = (ProductDAO) context.getBean("productDAO");
		Product product = (Product) context.getBean("product");
		product.setId("oo1");
		product.setName("002");
		product.setDescription(" product1");
		product.setPrice("12345");
		productDAO.saveorUpdate(product);
		
		//ProductDAO.delete("CAT_1");
		//ProductDAO.get("CAT_1");
	
		List<Product>  list =productDAO.list();
		
		for(Product cat : list)
		{
			System.out.println(cat.getId()  + ":" +  cat.getName()  + ":"+  cat.getDescription()+":"+cat.getPrice());
		}
			
			
		context.close();
		
		
	}

}
