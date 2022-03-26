import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
/*HackerRank  Angry Professor Problem*/
public class Angry_Professor {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt(); //No of Test case
	  int count=0;
	  for(int i=0;i<n;i++)
	  {
		  int len=sc.nextInt(); //length of In time and out time
		  int pn=sc.nextInt(); // professor need at least pn(No of Student) in class
		  for(int j=0;j<len;j++)
		  {
			  int val=sc.nextInt();
			  if(val<=0) //Taking negative value to who are attend the class at correct time
				  count++;
		  }
		  if(count>=pn)
			  System.out.println("NO"); //if there is most number of students attend the class within correct time 
		                                //class will be cancel(NO)
		  else
			  System.out.println("YES"); //if most of them late comers then class will be cancel (YES) 
		  count=0;
	  }
	  sc.close();

	}

}
