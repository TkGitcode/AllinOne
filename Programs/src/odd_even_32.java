import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
/*32.Program to Check Whether a Number is Even or Odd*/
public class odd_even_32 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0)
			System.out.println("Given number is Even");
		else
			System.out.println("Given number is Odd");
sc.close();
	}

}
