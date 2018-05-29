package com.SeleniumProject.Javaprogrames;

public class DynamicArrayEg {

	public static void main(String[] args) 
	{
		int[] x=new int[5];

		System.out.println(x.length);
		
		//writing the data into an array
		x[2]=60000;
		x[4]=68000;
		x[2]=40000;
		
		for (int i = 0; i < x.length; i++)
		{
			System.out.println(x[i]);
			
		}
	}

}
