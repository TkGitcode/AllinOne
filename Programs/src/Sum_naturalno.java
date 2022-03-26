import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
/*38.Program to Calculate the Sum of Natural Numbers*/
public class Sum_naturalno {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		/*Formula to find sum of n natural number n*(n+1)/2
		 * natural number starts from 1 to infinity and only positive integer */
		int NN=n*(n+1)/2;
		System.out.printf("Sum of %d natural number is : %d",n,NN);
sc.close();
	}

}
