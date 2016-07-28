package com.lenovo.practice.spring.lesson01;

public class SpringBean3 {
	public void print(){
		System.out.println(this.getClass() +"===" + Integer.toHexString(this.hashCode()));
	}
}
