package org.practice;



public class Practice1 {
	
   int a=20; 
	void add() {
		int a=10;
		System.out.println(a);
		System.out.println(this.a);
	
	}
	public static void main(String[] args)
	{
		Practice1 b = new Practice1();
		b.add();
	}

}
