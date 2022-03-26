import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
/*55.Program to Check Prime or Armstrong Number Using User-defined method*/
public class UserDefine_55 {
	static int isprime(int n)
		{
		int carry=0;
			for(int i=2;i<=n/2;i++)
			{
			if(n%i==0)
			{
			    carry=1;
			}
			}
			return carry;
		}
	static int isamstrong(int n11)
	{
		int count=0,n1=n11,Rem=0;
				float res=0;
		for(n1=n11;n1!=0;count++)
		{
			n1/=10;
		}
		for (n1 = n11; n1 != 0; n1 /= 10) {
		       Rem = n1 % 10;
		      // store the sum of the power of individual digits in result
		      res += Math.pow(Rem, count);
		   }
		if((int)res==n11)
		return 1;
		else
			return 0;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(isprime(n)==0)
		{
			System.out.println("It is a prime");
		}
		else
			System.out.println("Not a prime");
		if(isamstrong(n)==1)
		{
			System.out.println("it is a Amstrong");
		}
		else
			System.out.println("Not a Amstrong ");
	}

}
