import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
/*41.Program to Display Fibonacci Sequence*/
public class FibonacciSeries_41 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt(),a=0,b=1;
		for(int i=0;i<n;i++)
		{
			int temp=a;
			a=b;
			b=temp;
			a=a+b;
			System.out.println(a);
		}
		sc.close();

	}

}
