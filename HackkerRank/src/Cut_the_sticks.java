import java.util.Arrays;
import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
public class Cut_the_sticks {

	static int min(int... var)
	{
		int min=Integer.MAX_VALUE;
		for(int i:var)
		{
			if(i<min)
				min=i;
		}
		return min;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int min=0;
	    for(int i=0;i<n;i++)
	    {
	    	min=min(a);
	    	for(int j=0;j<n;j++)
	    		
	    		b[j]=a[j]-min;
	    	System.out.println(Arrays.toString(b));
	    }

	}

}
