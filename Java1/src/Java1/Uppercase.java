package Java1;
/** 
* @Author -- TkGitcode
*/
public class Uppercase {

	public static void main(String[] args) {
		 String c="where are You from";
	     String c1=c;
	     StringBuffer b=new StringBuffer(c);
	     b.reverse();
	      String d=b.toString();
	     // System.out.println(d);
	      for(int i=0;i<d.length();i++)
	      {
	      if(c.charAt(i)>='A' && c.charAt(i)<='Z')
	      {
	         char c11= Character.toUpperCase(d.charAt(i));
	          System.out.print(c11);
	      }
	      else
	      {
	    	  char c12= Character.toLowerCase(d.charAt(i));
	         System.out.print(c12);
	      }
	      }
	}

}
