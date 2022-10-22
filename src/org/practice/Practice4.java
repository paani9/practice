package org.practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Practice4 {

	public static void main(String[] args) {
		String s="Good Morning Good Night";
		String[] arr=s.split(" ");
		Map<String,Integer> map=new LinkedHashMap<String,Integer>();
		for(String a:arr)
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
		for(Entry<String,Integer> set:map.entrySet())
		{if(set.getValue()>1)
			System.out.println(set.getKey()+" "+set.getValue());
			
		}

	}

}
