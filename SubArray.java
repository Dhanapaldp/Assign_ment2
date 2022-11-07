package Assignment2;

import java.util.Scanner;

public class SubArray {
	//To check whether an array is subset of another one

	public static void main(String[] args) {
	    Scanner s =new Scanner(System.in);
	    System.out.println("Enter the 1st array size");
	        int arr1Length=s.nextInt();
	    System.out.println("Enter the 2nd array size");
	        int arr2Length=s.nextInt();
	    System.out.println("Enter the 1st array elements");
	    int[] arr1=new int[arr1Length];
	    for(int i=0;i<arr1Length;i++)
		  {
			  arr1[i]=s.nextInt();
		  }
	    System.out.println("Enter the 2nd array elements");
	    int[] arr2=new int[arr2Length];
	    for(int i=0;i<arr2Length;i++)
		  {
			  arr2[i]=s.nextInt();
		  }
	    int count=0;
	    for(int i=0;i<arr2Length;i++)
	    {
	    	for(int j=0;j<arr1Length;j++)
	    	{
	    		if(arr2[i]==arr1[j])
	    		{
	    			count++;
	    			break;
	    		}
	    		
	    	}
	    }
	    if(count==arr2Length)
	    {
	    	System.out.println("Array arr2 is an subset of Array arr1");
	    }
	    else
	    {
	    	System.out.println("Array arr2 is not an subset of Array arr1");
	    }
	}

}
