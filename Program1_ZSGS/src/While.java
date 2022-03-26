/** 
* @Author -- TkGitcode
*/
public class While {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int n=a.length-1,i=0;
		int n1=n;
//		while(i<=n1)
//		{
//			System.out.println(a[n]);
//			n--;
//			i++;
//		}
		for(i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}

	}

}
