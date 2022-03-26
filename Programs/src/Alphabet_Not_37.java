import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
public class Alphabet_Not_37 {

	public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Character ");
        char c=sc.next().charAt(0);
        if(c>='0' && c<='9')
        	System.out.println("Given value is not a Character");
        else
        	System.out.println("Given Value is a Character");
        sc.close();
	}

}
