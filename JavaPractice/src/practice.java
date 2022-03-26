/** 
* @Author -- TkGitcode
*/
public class practice {
	public practice()
	{
		System.out.println("constructor");
	}
	{
	System.out.println("Non static block ");
	}
	{
		System.out.println("Non static block 1");
		}
      static 
     {
	System.out.println("Static block");
     }
      static 
      {
 	System.out.println("Static block 1");
      }
	public static void main(String[] args) {
		
		
		System.out.println("Main");
		practice sb=new practice();
		practice sb1=new practice(); 
	}

}
