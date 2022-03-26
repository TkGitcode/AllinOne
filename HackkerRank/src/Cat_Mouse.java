import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
/*HackerRank  Cats and a Mouse Problem*/
public class Cat_Mouse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int cat1= Math.abs(c-a); //Finding Distance of Mouse and CatA
			int cat2=Math.abs(c-b); //Finding Distance of Mouse and CatB
			int min=Math.min(cat2,cat1);//Finding Minimum Distance of Mouse Which Reach the cat
			if(cat1==cat2) //If Both distance are same
			{
				System.out.println("Mouse C"); //prints Mouse C
			}
			
			else if(min==cat1) //if Cat A Distance is Minimum
		         System.out.println("Cat A"); //prints Cat A
			else if(min==cat2) //if Cat B Distance is Minimum
				System.out.println("Cat B");// prints Cat B
			
		}
sc.close();
	}

}
