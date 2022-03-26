import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
/*Program to Find GCD of two Numbers*/
public class GCD_42 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value of a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int lcm_a=a,lcm_b=b;
		while(a!=b)         //b=20  //a=4
		{
			if(a>b)
				a-=b;
			else
				b-=a;
		}
		int lcm=(lcm_a*lcm_b)/a;
		System.out.println("GCD is : "+a);
		System.out.println("LCM is : "+lcm);
		sc.close();
	}

}
