import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
/*52.Program to Display Factors of a Number*/
public class factorofpositive_52 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				System.out.print(i+" ");
		}
sc.close();
	}

}
