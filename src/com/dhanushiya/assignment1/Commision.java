package com.dhanushiya.assignment1;
import java.util.Scanner;

public class Commision  
	{
		String name,address,commision;
		long phoneno;
		double sales_amount;
	    Scanner s=new Scanner(System.in);
		
		public void detailsofemployee() 
		{
			System.out.println("Enter employee name:");
			name=s.nextLine();
			System.out.println("address of employee:");
			address=s.nextLine();
			System.out.println("enter phoneno:");
			phoneno=s.nextLong();
			System.out.println("Sales_amount:");
			sales_amount=s.nextDouble();
			
		}
            public void calculateCommision()
            {
            if(sales_amount>100000)
            	commision="10%";
            else if (50000>=sales_amount && sales_amount<100000)
            	commision="5%";
            else if (30000>=sales_amount && sales_amount<50000)
            	commision="3%";
            else
            	commision="0";
            System.out.println("your commision is"+commision);
            }
            
	          public static void main(String[] args) {
	       Commision c=new Commision();
	       c.detailsofemployee();
	       c.calculateCommision();

}
	}