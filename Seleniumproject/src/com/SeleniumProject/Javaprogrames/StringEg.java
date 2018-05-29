package com.SeleniumProject.Javaprogrames;

public class StringEg {

	public static void main(String[] args) 
	{
		String course="  Selenium  ";
		System.out.println("You are selected "+course);
		
		System.out.println(course.length());
		
		System.out.println(course.charAt(4));

		System.out.println(course.substring(2, 5));
		
		System.out.println(course.toUpperCase());
		
		System.out.println(course.toLowerCase());
		
		System.out.println(course.trim());
		
		System.out.println(course.replace("e", "a"));
		
		if (course.trim().equalsIgnoreCase("selenium")) {
			System.out.println("Both the strings are same");
		}
		else
		{
			System.out.println("Both the strings are not same");
		}
		
		String msg="Record 11 11 updated successfully";
		
		if (msg.toLowerCase().contains("updated successfully")) {
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		System.out.println(course.startsWith("s"));
		
		System.out.println(course.endsWith(" "));
		
		System.out.println(course.join(":", "You are selected",course));
		
		msg.split(" ");
		
		System.out.println(msg.indexOf("11"));
	}

}
