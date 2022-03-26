/** 
* @Author -- TkGitcode
*/
public class array {

	public static void main(String[] args) {
		int a[]={5,10,20,30};
		int n=5;
		try
		{
		System.out.println(a[0]/n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
       finally
       {
    	   
    	   System.out.println("Finally");
       }
	}

}
