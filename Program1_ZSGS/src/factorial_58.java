import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
public class factorial_58 {
	 static int multiplyNumbers(int n) {
	    if (n>=1)
	        return n*multiplyNumbers(n-1);
	    else
	        return 1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		    int n;
		    System.out.println("Enter a positive integer: ");
		    n=sc.nextInt();
		    System.out.printf("Factorial of %d = %d", n, multiplyNumbers(n));
		}
	}