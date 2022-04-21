package week1.day2;

import java.util.Arrays;

public class FindIntersection {

	public static void main(String[]args)
	{
		int [] arr1 = {1,4,7,9,11,8};
		int [] arr2 = {8,11,6,12,15,2};	
		
		System.out.println("The intersection elements are : " );
		
		for(int i = 0; i< arr1.length; i++)
		{	
			for (int j=0 ; j< arr2.length; j++)
			{	
				if(arr1[i]==arr2[j])
				{
					System.out.println(arr1[i] );
				}
			}
		}
		
	}
}
