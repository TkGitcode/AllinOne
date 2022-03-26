/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codecheff_Que1
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		for(int j=0;j<n;j++)
		{
		int c1=sc.nextInt();
		String k=sc.next();
		char[] c = k.toCharArray();
		int count=0,flag=0;
		for(int i=0;i<c1-1;i++)
		{
		    while(c[i]!=c[i+1])
		    {
		        i++;
		        count++;
		        if(i==c1-1)
		      {
		       flag=1;
		       break;
		      }
		    }
		    if(flag==1)
		    break;
		}
		System.out.println(count+1);
		}
	}
}
