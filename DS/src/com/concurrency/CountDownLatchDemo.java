package com.concurrency;

import java.util.concurrent.CountDownLatch;

class CountDownLatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       final CountDownLatch c = new CountDownLatch(3);
        Thread cacheService = new Thread(new Service("Cache Service",1000,c));
        Thread validation = new Thread(new Service("Validation Service",1000,c));
        Thread logService = new Thread(new Service("log Service",1000,c));
       
       // start services
       cacheService.start();
       validation.start();
       logService.start();
       
        try{
        	c.wait();
        	System.out.println("Main Thread will start has all services are started and up ");
        }catch(InterruptedException ex){
        	Thread.interrupted();
        }
	}
   
}

class Service implements Runnable{
	
	private final int startTime;
	private final String name;
	private final CountDownLatch c ;
	
	public Service(String name, int startTime, CountDownLatch cc){
		this.name = name;
		this.startTime = startTime;
		this.c = cc;
	}
	
	public void run(){
		
		try{
			Thread.sleep(startTime);
			
		}catch(InterruptedException ex){
			//Thread.currentThread().interrupt();
		}
		System.out.println(" starting "+name);
		c.countDown();
		System.out.println(" count "+c.getCount());
	}
	
	
}
