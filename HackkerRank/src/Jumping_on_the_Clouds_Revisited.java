import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
public class Jumping_on_the_Clouds_Revisited {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int val=100,count=0,count1=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int set=3,j=0;
		for(int i=0;i<k;i+=2)
		{
			if(a[i+2]==1)
				count++;
		}
		System.out.println(count);
	   }

}
