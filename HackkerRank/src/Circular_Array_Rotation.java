
import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
/*HackerRank  Circular Array Rotation Problem*/
public class Circular_Array_Rotation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int q=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[q];
		int temp=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<q;i++)
		{
			b[i]=sc.nextInt();
		}
		for(int i=0;i<k;i++)
		{
			 temp=a[n-1];
			for(int j=1;j<n;j++)
			{
				a[n-j]=a[n-j-1];
			}
			a[0]=temp;
		}
		for(int i=0;i<q;i++)
		{
			System.out.println(a[b[i]]);
		}

	}

}
