import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
/*40.Program to Generate Multiplication Table*/
public class multiplication_40 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a table value : ");
		int n=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.printf("%d * %d = %d",i,n,i*n);
			System.out.println();
		}
		sc.close();
	}

}
