/** 
* @Author -- TkGitcode
*/
 class staticcount
{
	 int n=0;
	 static int count=0; /*static is not an object based, when we call the class
	                       by object it first runs a static method */
	staticcount(int k,int k1)
	{
		k=10;
		k1=9;
		k=n;
		//System.out.println(k);
		
	}
	staticcount()
	{
	}
	static void kl()
	{
		//System.out.println("Static method");
		count++; //2
	}
	void obj1()
	{
		count++; //1
		n++;//1
		kl(); //We can call static  Method from normal method but we cannot call normal method from static method
	}
	void obj2()
	{
		count++; //3
		n++;  //2
	}
	static void staticmethod()
	{
		 //  n=10;  //Here we cannot use any variable from the class or method Except static variable
		//count=9; //we can use count variable because count is static
		kl();  // Here it calls only the static method, It does not call any  method without static
		staticcount c=new staticcount();
		//System.out.println("Static Method");
		//staticcount.count=9;
		
	}

	
}
 class name extends staticcount
 {
	 name(int k,int k1)
	 {
	 super(k,k1);
	 }
 }
public class static_variable {
	{
		System.out.println("Empty");
	}
	
	static
	{
		System.out.println("I am from Static ");
	}
	
	public static void main(String[] args) {
		staticcount c=new staticcount(10,1);
	    c.obj1();
		c.obj2();
		int n=staticcount.count; //here we call the static method by class name
		//System.out.println("Main class :"+n);
		//System.out.println(c.n); //it is count of n from the class it is called by object name
		
		staticcount.staticmethod(); //Here i call a static method by class name
		n=staticcount.count;
		//System.out.println("Main class :"+n);
		
		
        
	}

}
