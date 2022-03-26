import java.util.Scanner;
/** 
* @Author -- TkGitcode
*/
/*48.Program to Check Whether a Number is Palindrome or Not*/
public class palindrome_48 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=15511;
		int n1=n;
				int reverse=0;
		while(n!=0)
		{
			int remainder=n%10;  //Take a remainder of a%10
			reverse=reverse*10+remainder; // the last digit
			n=n/10;
		}
		//System.out.println(reverse);
		if(reverse==n1)
		{
			System.out.println("Given number is palindrome");
		}
		else
			System.out.println("Given number is not a palindrome");
      sc.close();
	}

}
