package Java1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/** 
* @Author -- TkGitcode
*/
class su
{
	 
}
public class swe_1 {
	 int sum=0,sum1=0;
	 static  int  sum2(int min1)
	{
		 int sum=0,sum1=0;
		while(min1!=0)
		{
			sum=min1 % 10;
			min1 = min1 / 10;
			sum1=sum+sum1;
		}
		return sum1;
	}
	public static void main(String[] args) {
		int sum=0,sum1=0;
		int a[]= {91,101,610,447,389};
		int b[]= {610,4,91,4,101};
		int c[]=new int[100];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					c[i]=a[i];
				}
			}
		}
		int n=c.length;
		int j=0;
		for (int i=0; i < n-1; i++){  
            if (c[i] != c[i+1]){  
                c[j++] = c[i];  
            }}
		     c[j++] = c[n-1];
		for (int i=0; i<j-1; i++)  
	           System.out.println(c[i]+" ");
		int min=c[0];
		for(int i=0;i<j;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(min);
		//int sum=0,sum1=0;
		if(min>9)
		{
			System.out.print(min);
			//sum1=sum2(min);
			sum1=sum2(min);
			while(sum1>=9)
			{
				System.out.print(min);
				sum1=sum2(min);
			}
		}
		System.out.println(sum1);
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.print(" ");
		int a1[]=new int[a.length];
		int b1[]=new int[b.length];
		int k=0,k1=0;
		for (int i = a.length-1; i >= 0; i--) {  
			a1[k++]=a[i];  
		}
		System.out.println();
		for (int i = b.length-1; i >= 0; i--) {  
			b1[k1++]=b[i]; 
		}
		System.out.println();
		for(int i=sum1-1;i>=0;i--)
		{
			System.out.print(a1[i]+" ");
		}
			
			System.out.println();
			for(j=sum1-1;j>=0;j--)
			{
				
				System.out.print(b1[j]+" ");
			}
	}
	

}
