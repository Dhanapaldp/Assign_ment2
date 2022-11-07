package Assignment2;

import java.util.Scanner;

public class DuplicateValue
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		  System.out.println("Enter the size of array");
		  int n=scan.nextInt();
		  int[] ar=new int[n];
		  System.out.println("Enter the values in the array");
		  for(int i=0;i<n;i++)
		  {
			  ar[i]=scan.nextInt();
		  }
		  for(int i=0;i<n-1;i++)
		  {
			  int count=1,j;
			    for(j=i+1;j<n;j++)
			    {  
				   if(ar[i]!=-1)
				   {
					     if(ar[i]==ar[j])
					     {
						  count++;
						  //If the value is repeated then the repeated value is overrided by-1.
						  ar[j]=-1;
						  break;
					     }
				   }
			    }
			    if(count>1)
				  {
					  System.out.println("The value "+ar[i]+" is duplicate");
				  }
			      
		  }
	}  

}
