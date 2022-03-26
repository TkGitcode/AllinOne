import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
/*57.Program to Find the Sum of Natural Numbers using Recursion*/
public class sumofnaturalno_57 {
	static int addNumbers(int n) {
	    if (n != 0)
	        return n + addNumbers(n - 1);
	    else
	        return n;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		    int num=0;
		  System.out.println("Enter a positive integer: ");
		     num=sc.nextInt();
		    System.out.printf("Sum = %d", addNumbers(num));
		}	
}
