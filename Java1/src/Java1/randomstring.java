package Java1;

import java.util.Scanner;

class PswMat
{
	 boolean pass(String y)
	{
		Scanner v = new Scanner(System.in);
		System.out.println("Enter a Above CAPTCHA");
		String l=v.nextLine();
		if(l.equals(y))
		{
			v.close();
			return true;	
		}
		else
		{
			v.close();
			return false;
		}
		
	}
	 
}
 class randomstring {

	public static void main(String[] args) {
		String l= "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz12345";
        String Pswt = "";
        PswMat PM= new PswMat();
        for(int i=0;i<3;i++)
        {
        	Pswt += l.charAt((int)(Math.random() *  l.length()));
        }
        System.out.println(Pswt);
        boolean b= PM.pass(Pswt);
        
        if(b)
        {
        	System.out.print("Logined Successfully");
        }
        else
        {
        	System.out.print("Wrong CAPTCHA Enter a Correct CAPTCHA");
        	
        }
        
	}

}
