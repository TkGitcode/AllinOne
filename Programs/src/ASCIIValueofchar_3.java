import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
/*28.Program to Find ASCII Value of a Character*/
public class ASCIIValueofchar_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a char");
        char a=sc.next().charAt(0);
        //when we redeclare the datatype char to int then the output will be integer that integer is an ASCII value 
        int a1=a;
        System.out.println(a1);
        sc.close();
	}

}
