package com.SeleniumProject.Javaprogrames;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetEg {

	public static void main(String[] args) 
	{
		HashSet<Object> x=new HashSet<Object>();
		
		//Writing the data into hashset
		x.add("Selenium");
		x.add(60000);
		x.add("Apple");
		x.add('M');
		x.add("Selenium");
		
		Iterator<Object> it=x.iterator();
		
		while(it.hasNext())
		{
			Object data=it.next();
			System.out.println(data);
		}

	}

}
