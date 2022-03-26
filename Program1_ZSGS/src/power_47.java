import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
/*47.Program to Calculate the Power of a Number*/
public class power_47 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a base Value ");
		int a=sc.nextInt();
		System.out.println("Enter a Exponent");
		int b=sc.nextInt();
		int c=1;
		for(int i=1;i<=b;i++)
		{
			c=a*c;
		}
		System.out.printf("power of %d^%d is %d ",a,b,c);

	sc.close();
	}

}
