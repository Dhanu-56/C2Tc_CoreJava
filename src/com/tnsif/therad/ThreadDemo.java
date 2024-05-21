package com.tnsif.therad;
class Threadwide extends Thread
{
	public void run()
	{
		System.out.println("Thread Name:"+Threadwide.currentThread().getName());
		System.out.println("Thread Priority:"+Threadwide.currentThread().getPriority());
		}
	}
public class ThreadDemo {
          public static void main(String[] args)
          {
              System.out.println("Current thread details:" +Thread.currentThread());
        	  Threadwide td=new Threadwide();
        	  td.start();
        	  td.setName("Dhanu");
        	  td.setPriority(3);
        	  }
          }
