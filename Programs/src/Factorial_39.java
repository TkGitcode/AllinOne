import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
public class Factorial_39 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
		long n=sc.nextInt(),k=1;
		for(int i=1;i<=n;i++)
		{
			 k*=i;
		}
		System.out.printf("Factorial of %d is : %dl",n,k);
		sc.close();

	}

}
