import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
/*HackerRank  SavethePrisoner Problem*/
public class SavethePrisoner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int j=0;
		for(int i=0;i<len;i++)
		{
			int man=sc.nextInt();
			int food=sc.nextInt();
			int position=sc.nextInt();
			int val=food;
			int fin=0;
			for( j=position;j<=man;j++)
			{
				fin=j;
				while(j==man)
				{
					j=0;
				}
				val--;
				if(val==0)
					break;
			}
			System.out.println(fin);
		}
	}

}
