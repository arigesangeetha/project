package com.niit.Backend;


import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.Backend.dao.CategoryDAO;
import com.niit.Backend.model.Category;

public class CategoryTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.Backend");
		context.refresh();

		CategoryDAO categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
		Category category = (Category) context.getBean("category");
		category.setId("oo1");
		category.setName("002");
		category.setDescription(" product1");
		categoryDAO.saveorUpdate(category);
		
		//categoryDAO.delete("CAT_1");
		//categoryDAO.get("CAT_1");
	
		List<Category>  list =categoryDAO.list();
		
		for(Category cat : list)
		{
			System.out.println(cat.getId()  + ":" +  cat.getName()  + ":"+  cat.getDescription());
		}
			
			
		context.close();
		
		
	}

}
