import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
/*50.Program to Check Armstrong Number*/
public class Amstrong_50 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),Rem=0;
		float res=0;
		int n1=n,count=0;
		for(n1=n;n1!=0;count++)
		{
			n1/=10;
		}
		for (n1 = n; n1 != 0; n1 /= 10) {
		       Rem = n1 % 10;
		      // store the sum of the power of individual digits in result
		      res += Math.pow(Rem, count);
		   }
		//System.out.println(res);
		if((int)res==n)
		System.out.println("given number is Amstrong");
		else
			System.out.println("given number is Not a Amstrong");
		sc.close();
		}
	}

