import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
/*67.Program to Find Transpose of a Matrix*/
public class Transpose_67 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] a= {{1,2,3},{1,5,2},{7,4,8}};
		int[][] b=new int[30][30];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++) 
			{
				b[i][j]=a[j][i];
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Transpose");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}

	}

}
