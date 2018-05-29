package com.SeleniumProject.Javaprogrames;

public class ObjectEg {

	public static void main(String[] args) 
	{
		Object[]  x={20000,4444.44, true, "Selenium",'M'};
		
		System.out.println(x.length);
		
		for(Object data: x)
		{
			System.out.println(data);
		}

	}

}
