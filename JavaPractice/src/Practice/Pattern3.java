package Practice;
/** 
* @Author -- TkGitcode
*/
/*
A 
A B A 
A B C B A 
A B C D C B A 
A B C D E D C B A 
*/
public class Pattern3 {

	public static void main(String[] args) {
		char[] c= {'A','B','C','D','E'};
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(c[j]+" ");
			}
			if(i!=0)
			for(int j=i-1;j>=0;j--)
			{
				System.out.print(c[j]+" ");
			}
			System.out.println();
		}

	}

}
