package com.java.interview.questions.three;

public class Triplets {

	public static void main(String[] args) {

		int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
		try {
		for(int i=0;i<arr.length;i++)
		{
			int a=arr[i];
			int b= arr[i+1];
			int c=a+b;
			for(int j=2;j<arr.length;j++)
			{
				if(c==arr[j])
					System.out.println("sum of elements "+a+" and "+b+" are "+c+" and triplet index is : "+j);
			}
		}
		}catch(ArrayIndexOutOfBoundsException a)
		{
			
		}
	}

}
