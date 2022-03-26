package Java1;
//import java.util.Scanner;
public class Roman {
	public static void main(String[] args) 
	{
		char[] r= {'I','V','X','L','C','D','M'};
        int[] i= {1,5,10,50,100,500,1000};
        //Scanner c=new Scanner(System.in);
        String r1="XCIV";
        char[] c1=r1.toCharArray();
        int k=0;
       // System.out.println(r1.length());
        for(int i1=0;i1<r1.length();i1++)
        {
        
        	//System.out.println(c1[i1]);
        	for(int i2=0;i2<r.length;i2++)
        	{
        	if(c1[i1]==(r[i2]))
        	{
        		k=i[i2]+k;
        		//break;
        	}
        	}
        }
        System.out.print(k);
	}

}
