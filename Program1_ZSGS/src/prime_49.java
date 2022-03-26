import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
/*49.Program to Check Whether a Number is Prime or No*/
/*A prime number is a positive integer that is divisible only by 1 and itself*/
public class prime_49 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),carry=0;
		for(int i=2;i<=n/2;i++)
		{
		if(n%i==0)
		{
			//System.out.print(i+" ");
		    carry=1;
		    //break;
		}
		}
		if(carry==0)
			System.out.println("prime number");
		else
			System.out.println("its Not a prime number ");
		/*Program to Display Prime Numbers Between Intervals Using methodN numbers of prime number*/
                 int a=0;
                 for(int i=2;i<=n;i++)
                     {
	                   a=0;
		                  for(int j=1;j<=i;j++)
			                 if(i%j==0)
			                     {
		                            a++;
			                      }
		                   if(a==2)
			                System.out.println(i);
                      }
                  sc.close();

	             }
	        }

