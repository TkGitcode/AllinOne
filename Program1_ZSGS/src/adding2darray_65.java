/** 
* @Author -- TkGitcode
*/
/*65.Program to Add Two Matrices Using Multi-dimensional Arrays*/
public class adding2darray_65 {

	public static void main(String[] args) {
		int a[][]= {{1,2},{5,6}};
		int b[][]= {{6,3},{5,9}};
		int c[][]=new int[50][50];
        for(int i=0;i<a.length;i++)
        {
        	for(int j=0;j<b.length;j++)
        	{
        		c[i][j]= a[i][j]+b[i][j];
        	}
        }
        for(int i=0;i<a.length;i++)
        {
        	for(int j=0;j<a.length;j++)
        	{
        		System.out.print(c[i][j]+" ");
        	}
        	System.out.println();
        }
	}

}
