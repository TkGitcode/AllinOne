/** 
* @Author -- TkGitcode
*/
public class pattern1 {

	public static void main(String[] args) {
		int n=11;
		int a=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i-1;j++)
			{
			System.out.print("% ");
			if(j==a)
				System.out.println("@");
			}
			//System.out.println("%");
			System.out.println();
		}
		

	}

}
