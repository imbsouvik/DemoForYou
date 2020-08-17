package com.demo.qa.Demo;

public class AppTest{
	
	public int test(int a, int b){
		return a+b;
	}
	
	public static void main(String[] args) {
		AppTest atest = new AppTest();
		System.out.println(atest.test(5, 4));
	}
}