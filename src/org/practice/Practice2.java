package org.practice;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
W1 w = new W2();
w.w1();
	}
}
	class W1{
		void w1()
		{
			System.out.println("text");
		}
		
	}
	class W2 extends W1
	{
		void w1()
		{
			System.out.println("text"+"status");
		
		}

	}
