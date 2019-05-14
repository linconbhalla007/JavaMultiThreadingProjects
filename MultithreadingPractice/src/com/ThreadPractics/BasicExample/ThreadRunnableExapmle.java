package com.ThreadPractics.BasicExample;

public class ThreadRunnableExapmle {

	public static void main(String[] args) {
		Hello1 obj = new Hello1();
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		Thread t3 = new Thread(obj);
		Thread t4 = new Thread(obj);
		t1.start();
		t2.start();
//		t3.start();
//		t4.start();
	}
}


class Hello1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++) {
			System.out.println("This is Runnable Hi:-"+i);
		}
		
	}	
}
