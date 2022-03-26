import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
public class GCD_59 {
	static int hcf(int n1, int n2) {
	    if (n2 != 0)
	        return hcf(n2, n1 % n2);
	    else
	        return n1;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		    int n1, n2;
		   System.out.println("Enter two positive integers: ");
		    n1=sc.nextInt();
		    n2=sc.nextInt();
		    System.out.printf("G.C.D of %d and %d is %d.", n1, n2, hcf(n1, n2));
		    sc.close();
		}
}
