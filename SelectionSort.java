package Assignment2;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		  System.out.println("Enter the size of array");
		  int n=scan.nextInt();
		  int[] a=new int[n];
		  System.out.println("Enter the values to be present in the array");
		  for(int i=0;i<n;i++)
		  {
			  a[i]=scan.nextInt();
		  }
		  for(int i=0;i<n-1;i++)
		  {
			  int min_index=i;
			  for(int j=i+1;j<n;j++)
			  {
				  if(a[j]<a[min_index])
				  {
					 min_index=j;
				  }
			  }
			  int temp=a[i];
			      a[i]=a[min_index];
			      a[min_index]=temp;
		  }
		  System.out.println("The array after sorting");
		  for(int ele:a)
	       {
	    	   System.out.print(ele+ " ");
	       }

	}

}
