/** 
* @Author -- TkGitcode
*/
/*66.Program to Multiply Two Matrices Using Multi-dimensional Arrays*/
public class Multi_66 {

	public static void main(String[] args) {
		int a[][]= {{1,2},{5,6}};
		int b[][]= {{6,3},{5,9}};
		int c[][]=new int[50][50];
		int sum=0;
        for (int i=0;i<a.length;i++)
        {
        	for(int j=0;j<b.length;j++)
        	{
        		c[i][j]= a[i][j]+b[i][j];
        	}
        }
        for(int i=0;i<a.length;i++)
        {
        	for(int j=0;j<b.length;j++)
        	{
        		for(int k=0;k<a.length;k++)
        		{
        			sum=sum+a[i][k]*b[k][j];
        		}
        		c[i][j]=sum;
        		sum=0;
        		System.out.print(c[i][j]+" ");
        	}
        	System.out.println();
        }

	}

}
