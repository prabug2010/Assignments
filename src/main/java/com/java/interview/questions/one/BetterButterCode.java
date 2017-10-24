package com.java.interview.questions.one;

import java.util.LinkedHashMap;
import java.util.Map;

public class BetterButterCode {

	public static void main(String[] args) {

		String s = "better butter";
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		Map<Character, Integer> map2 = new LinkedHashMap<Character, Integer>();
		char c[] = s.toCharArray();
		int count =0;
		for (char ch : c) {
			if (map.containsKey(ch)) {
				 count = map.get(ch);
				map2.put(ch, count + 1);
			} else if(ch!=32) {
				map.put(ch, 1);
			}
		}
		String temp ="";
		for(Map.Entry<Character, Integer> e : map.entrySet())
		{
			if(e.getValue()==1)
			{
				temp+=e.getKey();
			}
			else if(e.getValue()>1)
			{
				System.out.println("Repeated character is "+e.getKey()+"and the count is : "+e.getValue());
			}
		}
		System.out.println(temp);
	}

}
