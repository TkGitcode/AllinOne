/** 
* @Author -- TkGitcode
*/
public class Constructor {

	
	 int i;
	public Constructor(int n)
	{
		i=n;
		System.out.println("Constructor "+(i+n));
	}
	public Constructor(int n,int n1)
	{
		System.out.println("Constructor "+(n1+n));
		System.out.println("Constructor "+i);
	}
	
	public static void main(String[] args) {
		int n=5;
		Constructor c=new Constructor(n);
		Constructor c1=new Constructor(n,n+55);
		System.out.println(c.i);
	}

}
