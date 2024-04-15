package com.dhanushiya.assignment1;
import java.util.Scanner;
public class StudentDetails 
{

	public static void main(String[] args) 
	{
		String name;
		char initial;
		long rollno;
	    char grade;
	    float percentage;
	    Scanner sr=new Scanner(System.in);
	    System.out.println("Enter your name:");
	    name=sr.nextLine();
	    System.out.println("Enter initial:");
	    initial=sr.next().charAt(0);
	    System.out.println("Enter your rollno:");
	    rollno=sr.nextLong();
	    System.out.println("Enter your grade:");
	    grade=sr.next().charAt(0);
	    System.out.println("Enter your percentage:");
	    percentage=sr.nextFloat();
	    
	    
	    System.out.println("Name:"+initial+"."+name);
	    System.out.println("Rollno:" +rollno);
	    System.out.println("Grade:" +grade);
	    System.out.println("Percetage:" +percentage);
	    
	}

}
