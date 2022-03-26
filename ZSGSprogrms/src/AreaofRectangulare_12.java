import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
public class AreaofRectangulare_12 {
/*12.Write a program to find the area of the square
 * Formula Value*Value;
  */
	public static void main(String[] args) {
		Scanner v =new Scanner(System.in);
		System.out.println("find the area of the square");
		System.out.println("Enter a Integer: ");
		int a=v.nextInt();
		a=a*a;
		System.out.println(a);
		System.out.println("======="); 
		System.out.println("find the area of the rectangle");
        /*13.Write a program to find the area of the rectangle
         * Formula => N=L*W */
		System.out.println("Enter the length: ");
		 int length = v.nextInt();
		System.out.println("Enter the width: ");
		 int width = v.nextInt();
		int rectangle = length * width;
		System.out.println("Area of rectangle " +  rectangle);
		System.out.println("=======");
		System.out.println("area of the cylinder");
		/*14.Write a program to find the area of the cylinder
		 * Formula => (int) ((2 * pi) * (radius * height)) +  (int) ((2 * pi) * (radius * radius))*/
		 float pi = 3.14f;
		 System.out.println("Enter a Height ");
	        int height = v.nextInt();
	        System.out.println("Enter a radius ");
	        int radius = v.nextInt();
	        int h=((int)(2 * pi) * (radius * height)) +   ((int)(2 * pi) * (radius * radius));
	        System.out.println("area of cylinder is: " + h);
	        System.out.println("=======");
	        /*15.Write a program to evaluate the polynomial equation 
	         * Formula : ax^2+bx+c=0
	         * x=-b+-root(b^2-4ac)/2a*/
	      //System.out.println("evaluate the polynomial equation ");
	        
	        
	        /*16.Given the radius of two concentric circle, find the area of the space between the circle
	         * Formula = > pi (x*x) - pi (y*y)*/
	        System.out.println("space between the circle");
	        System.out.print("Value of X :");
	        int x=v.nextInt();
	        System.out.print("Value of Y :");
	        int y=v.nextInt();
	        float n=pi*(x*x) - pi*(y*y);
	        System.out.println("area of the space between the circle  "+n);
	        System.out.println("=======");
	        System.out.println("Unary operators");
	        /*17.Write a program with Unary operators(+,-,++,--,!)*/
	        x=100;
	        x+=100;
	        System.out.println(x);
	        x++;
	        System.out.println(x);
	        --x;
	        System.out.println(x);
	        System.out.println("=======");
	        /*18.Write a program with Ternary Operator(variable = (Condition) ? if : else)*/
	        System.out.println("Ternary Operator");
	        x=(x!=100) ? 1 : 0;
	        /*19.Write a program with bitwise operators*/
	        int x1=5;
	        int x2=7;
	        System.out.println("Bitwise AND :" +(x1&x2));
	        System.out.println("Bitwise OR : "+(x1|x2));
	        //System.out.println("Bitwise Right Shift : "+(x1>>x2));
	        //System.out.println("Bitwise Left Shift :"+(x1<<x2));
	        System.out.println("Bitwise XOR : "+(x1^x2));
	        System.out.println("Bitwise Compliment : "+(~10));
	        System.out.println("=======");
	        System.out.println("prefix and postfix operator");
	        /*20.Write a program to find the difference between prefix and postfix operator
	         *Prefix (--variable) and postfix (variable ++) */
	        /*Prefix*/
	        System.out.println(++x1);
	        /*Postfix*/
	        System.out.println(x2--);
	        System.out.println("=======");
	        System.out.println("understand the difference");
	        /*21.Evaluate the following expression on paper and on program and understand the difference*/
	        int a1=100;
	        int a2=190;
	        /* ++a1-a2–*/
	       // int n1=(++a1-a2-);  //The final Single operator Will not Accepts 
	        System.out.println("The output for ++a1-a2- is The final Single operator Will not Accepts");
	        /* a%b++ */
	       // System.out.println(""+(++a1-a2-));
	       // System.out.println("a2"+a2);
	        System.out.println("The Output for a%b++ is "+a1%a2++); //PEDMAS
	        /*a*=b+5*/
	        System.out.printf("The Output for  a*=b+5 %d ",+(a1*=a2+5)); //PEDMAS
	        /*x=69>>>2*/
	        System.out.println("The Output for  x=69>>>2 is "+ (a1=69>>>2));
	        System.out.println("=======");
	        /*22.Evaluate the following expression on paper and on program and understand the difference a+=a++ + ++a + –a + a–; when a=28
                */
	        a=28;
	       // a=a+(a+1)+(1+a)+(-a)-a+a-;
	        System.out.println("The Output for  a+=a++ + ++a + –a + a– is Error ");
	        /*a=a+(a+1)+(1+a)+-(+)-a+a(-)Error)*/
	        System.out.println("=======");
	        /*23.Evaluate the following expression on paper and on program and understand the
               difference  x = x++ * 2 + 3 * –x;*/
	           a=x++*2+3*-x;
	           /*  1 * 2 + 3 * - 2
	            *  2 + (-6)
	            *  -4   */
	           System.out.println(a);//PEDMAS
	           /*24.Evaluate the following expression on paper and on program and understand the difference
                  If int y = 10 then find int z = (++y * (y++ + 5));*/
	           int y1=10,z=0;
	           if(y1==10)
	           System.out.printf("Output of z=++y1 *(y++ + 5) is :"+ (z=++y1 *(y++ + 5)));
	           System.out.println();
	           System.out.println("=======");
	           /*25.Evaluate the following expression on paper and on program and understand the difference
                 What is the value of x1 if x=5 ? x1= ++x – x++ + – x*/
	           // 6 - 6 - 7
	           // 0 - 7
	           x=5;
	            if(x==5)
	            {
	            	x1=++x - x++ + -x; 
	            	System.out.println("value of x1 :"+x1);
	            }
	            System.out.println("=======");
	            System.out.println("Basic Switch Case");
	       char Vowel='z';
	       switch(Vowel)
	       {
	       case 'a':
	    	   System.out.println("Vowel");
	    	   break;
	       case 'e':
	    	   System.out.print("Scond Vowel");
	    	   break;
	       case 'i':
	    	   System.out.print("Vowel");
	    	   break;
	       case 'o':
	    	   System.out.print("Vowel");
	    	   break;
	       case 'u':
	    	   System.out.print("Vowel");
	    	   break;
	    	   default :
	    	   System.out.println("Not a Vowel");
	    	   break;
	    	    
	       }
	       a=30;
	       /*30
            Left shift
            1 2 4 8 16 32 64 128 //bit
            0 1 1 1 1  0  0  0  
            00011110
            add two BV in Back and remove two BV in front
            00    011110   00 
            remove         add

            final
            01111000

            0+0+0+8+16+32+64 +04 */
	       System.out.println("Right Shift "+(a>>2));
	       /*Right shift
               1 2 4 8 16 32 64 128 
               0 1 1 1 1  0  0  0
               00011110
               00    10
               add   remove
               00 000111 10
       
               add two BV in front and remove two BV in Back
             00  00000111  10
            final
            00000111*/
	       System.out.println("Left Shift "+(a<<2));
	        v.close();
	}

}
