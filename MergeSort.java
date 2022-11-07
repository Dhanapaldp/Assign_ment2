package Assignment2;

import java.util.Scanner;

public class MergeSort {
	static void divideArray(int b[],int firstIndex,int lastIndex)
	{
		if(firstIndex<lastIndex)
		{
		int mid=(firstIndex+lastIndex)/2;
		divideArray(b,firstIndex,mid);
		divideArray(b,mid+1,lastIndex);
		mergeSort(b,firstIndex,mid,lastIndex);
		}
		
	}
	static void mergeSort(int b[],int firstIndex,int mid,int lastIndex)
	{
		int a[]=new int[b.length];  // Declaration of array for copy the elements in sorting order.
		int i=firstIndex;
		int j=mid+1;
		int k=firstIndex;
		while(i<=mid && j<=lastIndex)
		{
			if(b[i]<b[j])
			{
				a[k]=b[i];
				i++;
			}
			else
			{
				a[k]=b[j];
				j++;
			}
			k++;
		}
		if(i>mid)
		{
			while(j<=lastIndex)
			{
				a[k]=b[j];
				j++;
				k++;
			}
		}
		if(j>lastIndex)
		{
			while(i<=mid)
			{
				a[k]=b[i];
				i++;
				k++;
			}
		}
		for(k=firstIndex;k<=lastIndex;k++)
		{
			b[k]=a[k];
		}
		
	}

	public static void main(String[] args)
	{
		 Scanner scan=new Scanner(System.in);
		  System.out.println("Enter the size of array");
		  int n=scan.nextInt();
		  int[] b=new int[n];
		   System.out.println("Enter the values in the array");
		  for(int i=0;i<n;i++)
		  {
			  b[i]=scan.nextInt();
		  }
		  int firstIndex=0,lastIndex=n-1;
		  divideArray(b,firstIndex,lastIndex);
		  System.out.println("After sorting");
		  for(int i=0;i<b.length;i++)
		  {
			  System.out.print(b[i]+ " ");
		  }
		  

	}

}
