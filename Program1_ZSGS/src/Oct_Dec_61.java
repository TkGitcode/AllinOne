import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
/*61.Program to Convert Octal Number to Decimal and vice-versa*/
public class Oct_Dec_61 {
	public static int convertDecimalToOctal(int decimal)
    {
        int octalNumber = 0, i = 1;

        while (decimal != 0)
        {
            octalNumber += (decimal % 8) * i;
            decimal /= 8;
            i *= 10;
        }

        return octalNumber;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long dec=0;
		System.out.println("Enter a octal Number :");
		long n=sc.nextInt();
		int i=0;
		while(n!=0)
		{
			dec =(long)(dec +(n % 10)* Math.pow(8, i++));
	        n = n / 10;
		}
		System.out.println("Decimal Number : "+dec);
		int decimal = sc.nextInt();
        int octal = convertDecimalToOctal(decimal);
        System.out.printf("%d in decimal = %d in octal", decimal, octal);
        
	}

}
