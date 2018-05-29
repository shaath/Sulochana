package com.SeleniumProject.Javaprogrames;

public class TwoDimArrayEG {

	public static void main(String[] args)
	{
		Object[][] x=new Object[2][3];
		
		//Finding the length of the rows
		System.out.println("Rows Length: "+x.length);
		//Finding the length of the columns
		System.out.println("Columns length: "+x[0].length);
		
		//Writing the data into an array
		x[0][1]="Selenium";
		x[1][2]="Sulochana";
		
//		System.out.println(x[0][1]);
		
		for (int i = 0; i < x.length; i++) 
		{
			for (int j = 0; j < x[i].length; j++)
			{
				System.out.println(x[i][j]);
			}
		}
	}

}
