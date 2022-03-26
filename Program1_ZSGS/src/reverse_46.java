/** 
* @Author -- TkGitcode
*/
/*46.Program to Reverse a Number*/
public class reverse_46 {

	public static void main(String[] args) {
		long a=1233344l,reverse=0l;
		while(a!=0)
		{
			long remainder=a%10;  //Take a remainder of a%10
			reverse=reverse*10+remainder;
			System.out.println(reverse);// the last digit
			a=a/10;
		}
		System.out.println(reverse);
		
		int a1=563969,count=0;
//		while(a1!=0)
//		{
//			int re=a1%10;
//			count++;
//			a1=a1/10;
//		}
		System.out.println(count);

	}

}
///  56396
