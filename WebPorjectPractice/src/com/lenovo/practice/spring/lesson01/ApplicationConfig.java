package com.lenovo.practice.spring.lesson01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public SpringBean springBean(){
		return new SpringBean();
	}
	
	@Bean
	public SpringBean2 springBean2(){
		return new SpringBean2("11","22");
	}
	
	@Bean
	public SpringBean4 springBean4(){
		return new SpringBean4();
	}
}
