package com.anand.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.anand.Dao.dummyProductDao;
import com.anand.Dao.jdbcProductDao;

@Configuration
public class AppConfig1 {
	
	@Bean
	public dummyProductDao  dummyDao() {
		return new dummyProductDao();
	}
	
	@Bean
	public jdbcProductDao jdbcDao() {
		return new jdbcProductDao();
	}
	
	

}
