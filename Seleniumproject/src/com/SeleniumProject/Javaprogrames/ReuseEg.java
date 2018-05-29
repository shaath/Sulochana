package com.SeleniumProject.Javaprogrames;

public class ReuseEg {

	public static void main(String[] args) 
	{
		MethodsEg m=new MethodsEg();
		
		int res=m.sum(60,40);
		System.out.println(res);
		
		int r=m.sum(30, 20, 10);
		System.out.println(r);
	}

}
