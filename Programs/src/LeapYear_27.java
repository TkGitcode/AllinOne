import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
public class LeapYear_27 {

	public static void main(String[] args) {
		/*27.Leap year or not*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Year");
		int l=sc.nextInt();
		
		/*if Given Year divisible by 4 and at that time not divisible by 100 or given year divisible by 400 is leap year 
		 * otherwise is not a leap year
		 * 1700 and 1900 were not */
		if(((l%4==0) &&(l%100!=0)) || (l%400==0))
		{
			System.out.println("Its leap Year");
		}
		
		else
			System.out.println("Not a leap Year");
		sc.close();
	}

}
