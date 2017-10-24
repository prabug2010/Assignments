package com.java.interview.questions.one;

public class ArrayEquality {

	public static void main(String args[])
	{
		int[] a = new int[] {4,3,5,2,10};
		int n = a.length;
		int leftSum = 0;
		int rightSum = 0;
		for(int i=0;i<n; i++)
		{
			leftSum = leftSum+a[i];
		}
		System.out.println(leftSum);
		int equalvalue = leftSum/2; 
		System.out.println(equalvalue);
		int temp = 0;
		for(int j=n-1; j>=0;j--)
		{
			rightSum = rightSum+a[j];
			if(rightSum==equalvalue)
				temp=j;
		}
		
		System.out.println("The index where left part of array equal to right part : "+temp);
	}

}

