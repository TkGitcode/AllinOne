import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
public class Largestnumber_34 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter A value");
		int a=sc.nextInt();
		System.out.println("Enter B value");
		int b=sc.nextInt();
		System.out.println("Enter C value");
		int c=sc.nextInt();
			if(a>b)
			{
				if(a>c)
					System.out.println("Largest No is A");
				else if(b>c)
					System.out.println("Largest No is B");
				else
					System.out.println("Largest No is C");
			}
			else if(b>c)
			{
				if(b>a)
					System.out.println("Largest No is B");
			}
			else
				System.out.println("Largest No is C");
			sc.close();

	}

}
