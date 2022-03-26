import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
public class convertion_25 {

	public static void main(String[] args) {
		/*26.Conversion programs like km to Miles, centigrade to fahrenheit, sqft to acre etc..*/
		/* km to Miles*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Kilometer ");
		int n=sc.nextInt();
		float permiles=0.62137f;
		float KmtoM=n*permiles;
		System.out.printf("%d km  is %f Miles ",n,KmtoM);
		System.out.println();
		System.out.println("===============");
		/* centigrade to fahrenheit*/
		int F=0;
		System.out.println("Enter a centigrade ");
		int C=sc.nextInt();
		F = (C*9)/5*32;
		System.out.println("centigrade to fahrenheit : "+F);
		/*sqft to acre*/
		float Sqr=0f;
		float acre=0;
		System.out.println("Enter a Sqr");
		Sqr=sc.nextInt();
		acre=Sqr/43560f;
		//int fin=(int)acre;
		System.out.println("sqft to acre : "+acre);
		System.out.println();
		System.out.println("===============");
		
		sc.close();
	}

}
