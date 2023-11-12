package com.anand.Config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.anand.Dao.ProductDao;

public class P01_GetProductCount {

	public static void main(String[] args) {
		ProductDao dao;
		
		AnnotationConfigApplicationContext ctx;
		
		ctx= new AnnotationConfigApplicationContext(AppConfig1.class);
		
		 dao = ctx.getBean("jdbcDao", ProductDao.class);
		 System.out.println("dao is an instanceof "+ dao.getClass().getName());
		 System.out.println(dao.count());
		 
		 ctx.close();
		 

	}

}
