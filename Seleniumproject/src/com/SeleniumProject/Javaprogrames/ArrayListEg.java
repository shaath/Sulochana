package com.SeleniumProject.Javaprogrames;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args)
	{
		ArrayList<Object> x=new ArrayList<Object>();
		
		//Writing the data into arraylist
		x.add("Selenium");
		x.add('M');
		x.add(60000);
		
		x.add(1, "UFT");
		
		//Finding the size of the arraylist
		System.out.println(x.size());
		
		//Reading the data from arraylist
		for (int i = 0; i < x.size(); i++) 
		{
			System.out.println(x.get(i));
		}

	}

}
