package com.java.interview.questions.one;

public class FarthestDistArray {

	public static void main(String[] args) {

		int[] array = new int[] {1,2,3,4,6,10,2,3,9,5,12,23,5,23,45};
		int firstElement = 3;
		int secondElement = 5;
		int firstPos = 0;
		int lastPos = 0;
		for(int i=0; i<array.length;i++)
		{
			if(array[i]==firstElement)
				firstPos = i;
			if(firstPos!=0)
				break;
		}
		System.out.println(firstPos);
		for(int j=array.length-1;j>=0;j--)
		{
			if(array[j]==secondElement)
				lastPos = j;
			if(lastPos!=0)
				break;
		}
		System.out.println(lastPos);
		int diff = lastPos-firstPos;
		System.out.println("Farthest position "+diff);
	}

}
