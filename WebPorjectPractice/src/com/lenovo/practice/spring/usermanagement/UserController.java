package com.lenovo.practice.spring.usermanagement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/userManagement")
public class UserController {
	private List<User> userList = new ArrayList<User>();
	
	public UserController(){
		userList.add(new User("张三","20","男","西二旗"));
	}
	
	@RequestMapping("/userList")
	public ModelAndView listUsers(){
		ModelAndView mav = new ModelAndView("userManagement/userList");
		System.out.println("will direct to userList.jsp");
		mav.addObject("userList", userList);
		return mav;
	}
	
	@RequestMapping(value = "/addUser",method=RequestMethod.GET)
	public ModelAndView addUser(){
		ModelAndView mav = new ModelAndView("userManagement/addUser");
		System.out.println("will direct to Get addUser.jsp");
		return mav;
	}
	
	@RequestMapping(value = "/addUser",method=RequestMethod.POST)
	public ModelAndView addUser(String name,String age,String sex,String address){
		userList.add(new User(name,age,sex,address));
		ModelAndView mav = new ModelAndView("userManagement/userList");
		mav.addObject("userList", userList);
		System.out.println("will direct to Post addUser.jsp");
		return mav;
	}
}
