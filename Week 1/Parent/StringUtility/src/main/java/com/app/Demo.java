package com.app;

public class Demo 
{
	public static boolean Check(String a,String b)
	{
		return a.equalsIgnoreCase(b);
	}
	public static boolean Check1(String a,String b)
	{
		return a.contentEquals(b);
	}
	

	
}
