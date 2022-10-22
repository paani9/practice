package org.practice;

import java.util.LinkedHashSet;

public class Practice5 {

	public static void main(String[] args) {
	int[]	arr={1,1,2,2,4,6,3,3,4,4,4};
	LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
	
	for(int j=0;j<arr.length;j++)
	{
		set.add(arr[j]);
		
		
	}
	System.out.println(set);
	}
}
	
	