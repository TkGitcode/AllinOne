import java.util.Scanner;

public class Codecheff_Que {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		for(int j=0;j<n;j++)
		{
		int c1=sc.nextInt();
		String k=sc.next();
		char[] c = k.toCharArray();
		int count=0;
		for(int i=0;i<k.length()-1;i++)
		{
		    if(c[i]==c[i+1])
		    {
		    	i++;
		    	count++;
		    }
		    else
		    {
		    	count++;
		    }
		}
			System.out.println(count);
		}

	}

}
