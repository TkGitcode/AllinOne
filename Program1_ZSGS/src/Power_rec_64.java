import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
/*64.program to calculate the power using recursion.*/
public class Power_rec_64 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a base value ");
		int a=sc.nextInt();
		System.out.println("Enter a powe value ");
        int b=sc.nextInt();
        int c=powRec(a,b);
        System.out.printf("%d^%d = %d",a,b,c);
        sc.close();
	}
	
	static int powRec(int a,int b)
	{
		if(b!=0)
		return a=a*powRec(a,b-1);  //Recursion is like Stack 
		else
			return 1;
	}

}
