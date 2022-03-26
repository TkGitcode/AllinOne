import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
/*HackerRank SubArray Division Problem*/
public class birthdayproblem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[100];
		int n=sc.nextInt(); //No of Arrays Value
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int d=sc.nextInt(); //sum of d
		int m=sc.nextInt(); //sequence of m
		int sum=0,flag=0,count=0;
		for(int i=0;i<a.length-m+1;i++) //here a.length-m+1 for we should runs Array only once with m consecutive
		{
			for(int j=i;flag<m;j++)
			{
				sum=sum+a[j]; //checking consecutive order by m value 
				flag++; //its a condition for m
			}
			if(sum==d)
			{
			count++;
			}
			flag=0;
			sum=0;
		}
		System.out.println(count); //count is output 
		sc.close();

	}

}
