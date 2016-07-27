package com.niit.Backend;


import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.Backend.dao.SupplierDAO;
import com.niit.Backend.model.Supplier;

public class SupplierTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.Backend");
		context.refresh();

		SupplierDAO supplierDAO = (SupplierDAO)context.getBean("supplierDAO");
		Supplier supplier = (Supplier) context.getBean("supplier");
		supplier.setId("oo1");
		supplier.setName("002");
		supplier.setAddress(" product1");
		supplierDAO.saveorUpdate(supplier);
		
		//SupplierDAO.delete("CAT_1");
		//SupplierDAO.get("CAT_1");
	
		List<Supplier> list =supplierDAO.list();
		
		for(Supplier cat : list)
		{
			System.out.println(cat.getId()  + ":" +  cat.getName()  + ":"+  cat.getAddress());
		}
			
			
		context.close();
		
		
	}

}
