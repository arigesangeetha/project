package com.niit.Backend;


import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.Backend.dao.UserDAO;
import com.niit.Backend.model.User;

public class UserTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.Backend");
		context.refresh();

		UserDAO userDAO = (UserDAO) context.getBean("userDAO");
		User user = (User) context.getBean("user");
		user.setId("oo1");
		user.setName("002");
		user.setPassword("sangeetha");
		user.setMobile("12345");
		user.setMail("sangeetha@mail.com");
		user.setAddress("bajarahills");
		
		userDAO.saveorUpdate(user);
		
		//UserDAO.delete("CAT_1");
		//UserDAO.get("CAT_1");
	
		List<User>  list =userDAO.list();
		
		for(User cat : list)
		{
			System.out.println(cat.getId()  + ":" +  cat.getName()  + ":"+  cat.getPassword()+":"+cat.getMobile()+":"+cat.getMail()+":"+cat.getAddress());
		}
			
			
		context.close();
		
		
	}

}
