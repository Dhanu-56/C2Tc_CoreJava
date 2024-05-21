package com.tnsif.oddeven;

public class ArrayOperations {
	static void printArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"\t");
		System.out.println();		
	}
	
	
	//count  no .of.odd elements
	public  static int getOddCount(int b[])
	{
		int count = 0;
		for( int i =0; i < b.length;i++)
		{
		  if( b[i]%2!=0)
		   count++;
		}
		return count;
		
	}
	public  static int getEvenCount(int b[])
	{
		int count = 0;
		for( int i =0; i < b.length;i++)
		{
		  if( b[i]%2==0)
		   count++;
		}
		return count;
		
	}
}

