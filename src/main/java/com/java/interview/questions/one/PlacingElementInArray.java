package com.java.interview.questions.one;

public class PlacingElementInArray {

	public static void main(String[] args) {

		char[] ch = new char[] {'T','T','F','T','F','T','T','T','F','T','T'};
		int n = ch.length;
		for(int i=0;i<n; i++)
		{
			if(i==0&&ch[i]=='T'&&ch[i+1]=='T')
			{
				ch[i]='F';
			}
			if(ch[i]=='T'&&ch[i+1]=='T'&&i<n&&ch[i-1]=='F')
			{
				ch[i+1]='F';
			}
	}
		
		for(int x=0; x<n; x++)
		{
			System.out.print(ch[x]+" ");
		}
}
}