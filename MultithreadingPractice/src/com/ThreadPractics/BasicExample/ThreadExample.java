package com.ThreadPractics.BasicExample;

public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hello obj = new hello();
		obj.show();

	}

}
class hello{
	public void show() { 
		for(int i=0;i<=10;i++) {
			System.out.println("hello:-"+i);
			hi obj = new hi();
			obj.show1();
		}
	}
}
class hi{
	public void show1() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.println("this is for print thread: HI"+i);
		}
		
	}
	
}
