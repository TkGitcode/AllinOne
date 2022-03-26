import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
public class Vowel_33 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
        char c =sc.next().charAt(0);
        c=Character.toLowerCase(c);
        switch(c)
        {
        case 'a':	
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        System.out.print("Given character is Vowel");
        break;
        default :
        System.out.println("Given character is Consonant");
        break;
        }
        sc.close();
	}

}
