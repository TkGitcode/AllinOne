package Practice;
/** 
* @Author -- TkGitcode
*/
/* 
 10
**********
*       *
*      *
*     *
*    *
*   *
*  *
* *
**
*     */
public class Pattern2 extends Pattern{
	public static void main(String[] args) {
		
		int n=Pattern.sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i!=0)
				{
				if(j==0)
				{
				System.out.print(" * ");
				}
				if(j==n-i-2)
				{
				System.out.print("*");
				break;
				}
				else
					System.out.print(" ");
				}
				else
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
	
}
