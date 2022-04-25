/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner x=new Scanner(System.in);
		int t=x.nextInt();
		while(t-->0)
		{
		    int n=x.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=x.nextInt();
		        
		    }
		    
		    int start=0;
		   int end=n-1;
		   while(end>start)
		   {
		       int temp=arr[start];
		       arr[start]=arr[end];
		       arr[end]=temp;
		       start++;
		       end--;
		   }
		   
		   for(int i=0;i<n;i++)
		   {
		       System.out.print(arr[i]+" ");
		   }
		   System.out.println();
		}
		
	}
}
