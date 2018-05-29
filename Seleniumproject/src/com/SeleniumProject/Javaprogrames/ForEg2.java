package com.SeleniumProject.Javaprogrames;

public class ForEg2 {

	public static void main(String[] args) 
	{
//		for (int i = 1; i <= 100 ; i=i+2) {
//			System.out.println(i);
//		}
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j <= i; j++) 
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
