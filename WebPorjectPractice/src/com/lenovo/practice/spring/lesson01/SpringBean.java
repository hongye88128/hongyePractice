package com.lenovo.practice.spring.lesson01;

public class SpringBean {
	public void print(){
		System.out.println(this.getClass() +"===" + Integer.toHexString(this.hashCode()));
	}
}
