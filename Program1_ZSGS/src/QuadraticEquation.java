import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
public class QuadraticEquation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  a,b,c Value");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		/* The real number a is called the real part of the complex number a + bi; the real number b is called its imaginary part */
		// b^2-4ac
		int d=b*b-4*a*c;
		if(d>0)
		{
			//If the value of d is positive, both roots are real and different. It means there are two real solutions
			double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);  
			double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);  
			System.out.println("The roots are " + r1 + " and " + r2);  
		}
		else if(d==0)
		{
			//If the value of d is zero, both roots are real and the same. It means we get one real solution.
			double r1 = -b / (2.0 * a);  
			System.out.println("The root is " + r1);  
		}
		else
			//If the value of d is negative, both roots are distinct and imaginary or complex. It means that there are two complex solutions.
			System.out.println("Roots are not real.");  
		
		sc.close();
		

	}

}
