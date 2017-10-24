package com.java.interview.questions.three;

public class MaxAndSecondMax {

	public static void main(String[] args) {

		int[] array = new int[] {10,26,27,18,29,75,30,33};
		int firstMax = 0;
		int secondMax = 0;
		for(int i=0; i<array.length;i++)
		{
			if(array[i]>firstMax)
			{
				secondMax=firstMax;
				firstMax=array[i];
			}
			else if(array[i]>secondMax)
			{
				secondMax = array[i];
			}
		}
		
		System.out.println("The first max number is : "+firstMax+" and second max number is :"+secondMax);
	}

}
