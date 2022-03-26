/** 
* @Author -- TkGitcode
*/
class Name
{
	private int k1=0;
	public  Name(String k,int k2)
	{
		k1=k2;  // we cannot use k2 variable inside a method in class
		System.out.println("My Name is "+k);
		// return k1; constructor does not returns value
	}
	int city()
	{
		System.out.println("Chennai");
		// System.out.println(k2);  when we use k2 in city() method it may shows error
		System.out.println(k1);//but we can access k1 because we declare a k1 in outside of method and inside of class 
		                      //is known as Instance Variable
		return k1; //method can returns value
	}
	void pincode()
	{
		System.out.print("6000001");
	}
}
public class Class_Object {

	public static void main(String[] args) {
		Name n =new Name("kumar",7);
		int k=n.city();
		System.out.println(k);
		n.pincode();
		
	}

}
