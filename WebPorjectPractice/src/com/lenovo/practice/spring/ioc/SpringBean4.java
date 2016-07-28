package com.lenovo.practice.spring.ioc;

public class SpringBean4 {
	public void print(){
		System.out.println(this.getClass() +"===" + Integer.toHexString(this.hashCode()));
	}
}
