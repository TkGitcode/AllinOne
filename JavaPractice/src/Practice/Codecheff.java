package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
public class Codecheff {

	static ArrayList<Integer> rem(long n)
	{
		int rem;
		int j=0;
		String k2=String.valueOf(n);
		ArrayList<Integer> k1=new ArrayList<>();
		while(n!=0)
		{
			rem=(int) (n%10);
			k1.add(rem);
			n=n/10;
		}
		return k1;
	}
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		ArrayList<Integer> al1=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0,flag=0;
		while(n-- >0)
		{
			long a=sc.nextInt();
			al=rem(a);
			al1=al;
			int c=0,c1=0;
			System.out.println(al);
			Collections.reverse(al);
			System.out.println(al);
			for(int i=0;i<al.size()-1;i++)
			{
			for(int j=0;j<=i;j++)
			{
				c+=al.get(j);
				System.out.print(al.get(j));
			}
			System.out.println(" ");
			for(int k=i+1;k<al.size();k++)
			{
				c1+=al.get(k);
				System.out.print(al.get(k));
			}
			System.out.println();
			if(c+c1 % 2==0)
			{
				System.out.println("YES");
				flag=1;
				break;
			}
			}
			if(flag==0)
				System.out.println("NO");
			
			
		}

	}

}
