package com.lenovo.practice.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
	public static void main(String[] args) {
		//使用注解方式获取bean
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
	    SpringBean spBean = (SpringBean)ctx.getBean("springBean");
	    spBean.print();
	    //带属性值
	    SpringBean2 spBean2 = (SpringBean2)ctx.getBean("springBean2");
	    spBean2.print();

	    //使用xml配置方式获取bean
	    ctx = new ClassPathXmlApplicationContext("beans.xml");
	    SpringBean3 spBean3 = (SpringBean3)ctx.getBean("springBean3");
	    spBean3.print();
	    //注解与配置相结合
	    SpringBean4 spBean4 = (SpringBean4)ctx.getBean("springBean4");
	    spBean4.print();
	}
}
