package org.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Practice3 {

	public static void main(String[] args) {
		String s="PAVANI";
		char[] arr=s.toCharArray();
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(Character a:arr)
		{
			if(!map.containsKey(a))
			{
				map.put(a,1);
			}
			else
			{
				int count=map.get(a);
				map.put(a,count+1);
			}
		}
		for(Entry<Character,Integer> set:map.entrySet())
		{
			System.out.println(set.getKey()+" "+set.getValue());
			
		}
		

	}

}
