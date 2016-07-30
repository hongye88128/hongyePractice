package com.lenovo.practice.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	/***
	 * 首页 返回至/pages/spring/hello.jsp页面
	 * 
	 * @return
	 */
	@RequestMapping("/hello")
	public ModelAndView index() {
		// 创建模型跟视图，用于渲染页面。并且指定要返回的页面为home页面
		ModelAndView mav = new ModelAndView("hello");
		System.out.println("will direct to hello.jsp");
		return mav;
	}
}
