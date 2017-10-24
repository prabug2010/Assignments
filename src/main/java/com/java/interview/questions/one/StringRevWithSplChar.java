package com.java.interview.questions.one;

public class StringRevWithSplChar {

	public static void main(String[] args) {
		String s = "st&i#g";
		char[] c = s.toCharArray();  
	     int x = 0;  
	     int y = c.length - 1; 
	     while (x < y) {  
	       if (!Character.isAlphabetic(c[x])) {  
	         x++;  
	       } else if (!Character.isAlphabetic(c[y])) {  
	         y--;  
	       } else {  
	         char temp = c[x];  
	         c[x] = c[y];  
	         c[y] = temp;  
	         x++;  
	         y--;  
	       }  
	     }  
	     	System.out.println(c);
	}

}