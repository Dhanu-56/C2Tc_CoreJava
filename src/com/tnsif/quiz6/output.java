package com.tnsif.quiz6;
class Myexception extends Exception
{
	int detail;
	Myexception(int a)
	{
		detail=a;
	}
	public String toString()
	{
		return "detail";
	}
}
public class output {
static void compute (int a)throws Myexception
{
	throw new Myexception(a);
}
public static void main(String[] args)
{
	try
	{
		compute(3);
	}
		catch(Myexception e)
		{
			System.out.println("Exception");
		}
	}
}
