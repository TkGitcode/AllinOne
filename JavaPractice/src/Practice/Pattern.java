package Practice;

import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
public class Pattern {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int n=Pattern.sc.nextInt();
		for(int i=0;i<=n/2;i++)
		{
			if(i==0)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			else
			{
				for(int j=n/2;j>=i;j--)
					System.out.print("*");
				for(int j=0;j<i*2-1;j++)
					System.out.print("#");
				for(int j=n/2;j>=i;j--)
				{
					
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
		System.out.println();
		for(int i=0;i<=n/2;i++)
		{
			if(i==n/2)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			else
			{
				if(i!=0)
			{
				for(int j=0;j<=i;j++)
					System.out.print("*");
				for(int j=0;j<=((n/2)-(i*2-2)-1);j++)
					System.out.print("#");
				for(int j=0;j<=i;j++)
					System.out.print("*");
				System.out.println();
				}
			}
			
		}
		sc.close();
	}
}
