package com.ThreadPractics.BasicExample;

public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello thread1 = new Hello("Thread 1");
		thread1.start();
		Hi threa2 = new Hi("Thread 2");
		threa2.start();
		//threa2.run();
	}
}
class Hello extends Thread{
	Hello(String name){
		super(name);
	}
	public void show() { 
		for(int i=0;i<=10;i++) {
			System.out.println("hello:-"+i);
			Hi obj = new Hi("say to hi...");
			obj.show1();
		}
	}
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("This is Hello:-"+i+"Thread Name Is:-"+Thread.currentThread().getName());
		}
	}
}

class Hi extends Thread{
	Hi(String name){
		super(name);
	}
	public void show1() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.println("this is for print thread: HI"+i);
		}
	}
	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("This is Hi:-"+i+"Thread Name Is:-"+Thread.currentThread().getName());
		}
	}
}
