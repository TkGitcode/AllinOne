import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
/*.Program to Check Whether a Number is Positive or Negative*/
public class Pos_Neg_36 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Integer");
		int n=sc.nextInt();
		if(n<0)
			System.out.println("Entered Number is Negative");
		else
			System.out.println("Enetred Number is Positive");
sc.close();
	}

}
