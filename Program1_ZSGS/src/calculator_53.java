import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
public class calculator_53 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a two number");
		int n=sc.nextInt();
		int n1=sc.nextInt();
		System.out.println("Enter the operator to perform (+,-,/,%,*)");
		char ch=sc.next().charAt(0);
		int cal=0;
		switch(ch)
		{
		case '+':
			cal=n+n1;
			System.out.println("Addtion : "+cal);
			break;
		case '-':
			cal=n-n1;
			System.out.println("Subtraction : "+cal);
			break;
		case '/':
			cal=n/n1;
			System.out.println("Division : "+cal);
			break;
		case '*':
			cal=n*n1;
			System.out.println("Multiplication : "+cal);
			break;
		case '%':
			cal=n%n1;
			System.out.println("Modulo : "+cal);
			break;
		default :
			System.out.println("No such operator");
		break;
		}
		sc.close();
			

	}

}
