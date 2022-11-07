package Assignment2;

import java.util.Scanner;

public class QuickSort {
	static void quickSort(int []arr,int low,int high)
	{
		if(low>=high)
		{
			return;
		}
		    int startIndex=low;
		    int endIndex=high;
		    int mid=(startIndex+endIndex)/2;
		    int pivot=arr[mid];
		while(startIndex<=endIndex)
		{
		    while(arr[startIndex]<pivot)
			    startIndex++;
		    while(arr[endIndex]>pivot)
			      endIndex--;
		   if(startIndex<=endIndex)
		   {
		   int temp=arr[startIndex];
		       arr[startIndex]=arr[endIndex];
		       arr[endIndex]=temp;
		       startIndex++;
		       endIndex--;
		   }
		}	
		quickSort(arr,low,endIndex);
		quickSort(arr,startIndex,high);
	}

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		  System.out.println("Enter the size of array");
		  int n=scan.nextInt();
		  int[] arr=new int[n];
		  System.out.println("Enter the values in the array");
		  for(int i=0;i<n;i++)
		  {
			  arr[i]=scan.nextInt();
		  }
		  int lowIndex=0,highIndex=n-1;
		quickSort(arr,lowIndex,highIndex);
		System.out.println("After sorting the array");
       for(int ele:arr)
       {
    	   System.out.print(ele+ " ");
       }
	}

}
