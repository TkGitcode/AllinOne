package Java1;

import java.util.Scanner;

public class oddoreven {
    public static void main(String... args)
    {
    	Scanner c1 =new Scanner(System.in);
    	int n=c1.nextInt();
    	int n1=0,n2=0,count=0;
    	while(n!=1)
    	{
    	if(n%2==0)
    	{
    		n1=n/2;
    		System.out.printf("%d is even so i take half %d",n,n1);
    		System.out.println();
    		n=n1;
    		count++;
    	}
    	else
    	{
    		n2=3*n+1;
    		System.out.printf("%d is odd so i make 3n+1 = %d ",n,n2);
    		System.out.println();
    		n=n2;
    		count++;
    	}
    	}
    	System.out.printf("There are total %d Steps to reach 1",count);
    	c1.close();
    }
}
