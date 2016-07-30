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
	public ModelAndView hello() {
		// 创建模型跟视图，用于渲染页面。并且指定要返回的页面为home页面
		ModelAndView mav = new ModelAndView("hello");
		System.out.println("will direct to hello.jsp");
		return mav;
	}

	@RequestMapping("form")
	public ModelAndView formProcess(String name, String password) {
		System.out.println("username===========>" + name);
		System.out.println("password===========>" + password);
		String result = "";
		if ("admin".equals(name) && "admin".equals(password)) {
			result = "success";
		} else {
			result = "fail";
		}
		ModelAndView mav = new ModelAndView(result);
		mav.addObject("name", name);
		System.out.println("will direct to " + result + ".jsp");
		
		return mav;
	}
}
