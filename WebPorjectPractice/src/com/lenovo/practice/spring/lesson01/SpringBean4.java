package com.lenovo.practice.spring.lesson01;

public class SpringBean4 {
	public void print(){
		System.out.println(this.getClass() +"===" + Integer.toHexString(this.hashCode()));
	}
}
