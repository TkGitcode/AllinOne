package Java1;

import java.util.ArrayList;
import java.util.Scanner;

public class table {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    int n1=sc.nextInt();
		    int k1=0,k2=0,max=0;
		    ArrayList<Integer> krr=new ArrayList<Integer>();
		    for(int j=0;j<n1;j++)
		    {
		        krr.add(sc.nextInt());
		    }
		    int mid=n1/2;
		    
		    mid=mid-1;
		    //System.out.println(mid);
		     if(mid==-1)
		    {
		    	System.out.println(krr.get(0));
		    }
		     else if(n1==2)
		     {
		    	 max=Math.max(+krr.get(0),krr.get(1));
			    	System.out.println(max);
		     }
		    else if(mid>=0)
		    {
		        for(int k=0;k<mid;k++)
		        {
		             k1=k1+krr.get(k);
		        }
		        for(int l=mid+1;l<n1;l++)
		        {
		            k2=k2+krr.get(l);
		        }
		         max=Math.max(k1,k2);
			    System.out.println(max);
		    }
//		    else if(mid==0)
//		    {
//		    	max=Math.max(+krr.get(0),krr.get(1));
//		    	System.out.println("3rd "+max);
//		    }
		    
		    krr.clear();
		    k1=0;
		    k2=0;
		    
		}
	}

}
