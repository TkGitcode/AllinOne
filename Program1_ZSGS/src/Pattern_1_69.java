import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
public class Pattern_1_69 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Pattern 1");
		for(int i=1;i<=n;i++)
		{
			//System.out.println(i);
			for(int k=n-i;k>=1;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println("Pattern 2");
		for(int i=1;i<=n;i++)
		{
			//System.out.println(i);
			for(int k=n-i;k>=1;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("Pattern 3");
		for(int i=1;i<=n;i++)
		{
			//System.out.println(i);
			for(int k=n-i;k>=1;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("Pattern 4");
		for(int i=1;i<=n;i++)
		{
			//System.out.println(i);
			for(int k=n-i;k>=1;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int k=i;k>1;k--)
			{
				System.out.print(k-1);
			}
		System.out.println();
		}
		System.out.println("Pattern 5");
		
		for(int i=1;i<=n;i++)
		{
			//System.out.println(i);
			for(int k=n-i;k>=1;k--)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print((n-j+1));
			}
			for(int k=1;k<i;k++)
			{
				System.out.print(n-k);
			}
		System.out.println();
		}
		System.out.println("Pattern 6");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=n-i;k>=1;k--)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		System.out.println("Pattern 7");
		for(int i=1;i<=n;i++)
		{
			//System.out.println(i);
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=n-i;k>=0;k--)
			{
				System.out.print((n-i+1 )+" ");
			}
			
			System.out.println();
		}
	}

}
