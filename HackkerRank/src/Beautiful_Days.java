import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
/*HackerRank  Beautiful Days at the Movies Problem*/
public class Beautiful_Days {

	static int Reverse(int n)
	{
		int rev=0;
		while(n!=0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int startdate=sc.nextInt(); //Starting date
		int enddate=sc.nextInt(); //Ending Date
		int div=sc.nextInt(); //Divided by value
		int count=0;
		for(int i=startdate;i<=enddate;i++)
		{
			int re=Reverse(i); //function returns the reverse of String
			int abs=Math.abs(i-re); //Taking Absolute value of Date and reverse
		    double d=(double)abs/div; //Converting divided value into double because we need to find a Whole number
		    if(d%1==0)
		    	count++; //if value is whole number count will increase by 1
		}
		System.out.println(count); //Finally we print the count of whole number
        sc.close();
	}

}
