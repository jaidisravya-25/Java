package com.tnsif.multithreading;

public class  ThreadDemo extends Thread {
public void run()
{
	for(int i=1;i<=10;i++)
	{
		try {
			System.out.println("this is Thread");
			System.out.println(Thread.currentThread ());
			Thread.sleep(2000);
			
		}catch(Exception e ) {
			{
				System.out.println(e);
				
			}
			
		}
		
	}
	
}
}


