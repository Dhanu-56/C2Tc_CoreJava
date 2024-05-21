package com.tnsif.therad;
class Threads extends Thread{
	public void run() {
	System.out.println("Inside the run method:"+this.isAlive());
	  for(int i=1;i<=5;i++)
	  {
		System.out.println("Inside the run method:"+this.isAlive());
		try
		{
		sleep(500);
		}
		catch(Intrrupted)
	  }
	  
		
	
	
}
public class MyThread {

}
