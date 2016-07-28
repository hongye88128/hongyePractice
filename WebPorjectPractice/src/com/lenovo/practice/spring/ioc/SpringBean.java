package com.lenovo.practice.spring.ioc;

public class SpringBean {
	public void print(){
		System.out.println(this.getClass() +"===" + Integer.toHexString(this.hashCode()));
	}
}
