package com.SeleniumProject.Javaprogrames;

public class NestedIFEg {

	public static void main(String[] args) 
	{
		int a=30;
		int b=200;
		int c=10;
		
		if(a > b && a > c)
		{
			System.out.println("A is Greater");
		}
		else if (b > c && b > a)
		{
			System.out.println("B is Greater");
		}
		else if (c > a && c > b) 
		{	
			System.out.println("C is Greater");
		}

	}

}
