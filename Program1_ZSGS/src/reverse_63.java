import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
public class reverse_63 {
	static int i=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String k=sc.next();
		String k1=Reverserec(k);
        System.out.println("Reverse String is : "+k1);
	}
	static String Reverserec(String sen)
	{
		if(sen.isEmpty())
		return sen;
		else
		{
			i++;
			System.out.println(i +" "+Reverserec(sen.substring(1))+sen.charAt(0));
			return Reverserec(sen.substring(1))+sen.charAt(0);
		}
	}

}
