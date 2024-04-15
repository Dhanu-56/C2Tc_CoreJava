package com.tnsif.assignment1;
import java.util.Scanner;
public class Circle {
 
		Scanner s=new Scanner(System.in);
		float radius;
		String colour;
		void getInput()
		{
			System.out.println("Enter a radius:");
			radius=s.nextFloat();
			System.out.println("Enter a colour:");
			colour=s.next();
			
			
		}
           float calArea()
            {
            float Area=3.14f*radius*radius;
            return Area;
            			
            }
            public static void main(String[] args) {
            	Circle c=new Circle();
            	c.getInput();
            	Float Area=c.calArea();
            	System.out.println("Area of the Circle:"+Area);
            	
	}


}
