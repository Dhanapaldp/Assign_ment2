package Assignment2;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		  System.out.println("Enter the size of array");
		  int size=scan.nextInt();
		  int[] ar=new int[size];
		  System.out.println("Enter the values in the array");
		  for(int i=0;i<size;i++)
		  {
			  ar[i]=scan.nextInt();
		  }
		  System.out.println("The array before sorting");
          for(int print:ar)
          {
        	System.out.print(print+" ");  
          }
		  for(int i=0;i<size;i++)
		  {
			  for(int j=1;j<size;j++)
			  {
				  if(ar[j-1]>ar[j])
				  {
					  int temp=ar[j-1];
					      ar[j-1]=ar[j];
					      ar[j]=temp;
					    
				  }
			  }
		  }
		  System.out.println();
		  System.out.println("The array After sorting");
		  for(int element:ar)
		  {
			  System.out.print(element+" ");
		  }

	}

}
