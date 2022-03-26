import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
/*60.Program to Convert Binary Number to Decimal and vice-versa*/
public class binary_decimal_60 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Binary value");
		int a=sc.nextInt();
				int rem=0,b=1,a1=0;
		int n=a;
       while(a>0)
       {
    	   /*rem = 1101 % 10 => 1

             decimal_num = 0 + 1 * 1 => 1 (decimal_val = 0, rem = 1, & base = 1)

              num = 1101 / 10 => 110

               base = 1 * 2 => 2

            2nd iteration:

               rem = 110 % 10 => 0

               decimal_num = 1 + 0 * 2 => 1 (decimal_val = 1, rem = 0, & base = 2)

                num = 110 / 10 => 11


                base = 2 * 2 => 4
 
          3rd iteration:

               rem = 11 % 10 => 1

               decimal_num = 1 + 1 * 4 => 5 (decimal_val = 1, rem = 1, & base = 4)

               num = 11 / 10 => 1

                base = 4 * 2 => 8

          4th iteration:

                rem = 1 % 10 => 1

               decimal_num = 5 + 1 * 8 => 1 (decimal_val = 5, rem = 1, & base = 8)

                num = 1 / 10 => 0

                base = 8 * 2 => 16*/
    	   rem = a % 10; 
           a1 = a1 + rem * b;  
           a = a / 10; 
           b = b * 2; 
       }
       System.out.println("Binary to decimal : "+a1);
       /*Decimal_binary*/
       System.out.println("Enter Decimal Value");
       int DB=sc.nextInt();
       int r[]=new int[100];
       int j=0;
       for(int i=0;DB>0;i++)
       {
    	   r[j++]=DB%2;
    	   DB=DB/2;
       }
       for(int i=j-1;i>=0;i--)
    	   System.out.print(r[i]);
       sc.close();
	}

}
