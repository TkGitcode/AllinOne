/** 
* @Author -- TkGitcode
*/
/*Abstract is opposite to Concrete
  Concrete : Refers to physical object in Real world
  Abstract : thought or Ideas or Concepts that does not exit Physically (Our Ideas are all Abstract)*/
  //Abstract is hiding the Implementation
 abstract class Hotel
{
	 //Abstract class only can be declare ,cannot be define
	abstract void Message(); /*if we creating a abstract Method, we must declare all those  abstract methods  in  
	                         subclass(which are the class or derived a base class)  */
	
	
}
class MediumClass extends Hotel
{

	void Message() {
		System.out.println("Welcome to Medium Class.. "); /*here we created a method(Message) because this class extends a base class(Hotel)                                                     Because Base class has Abstract Method*/
	}

}
class HighClass extends Hotel
{
	void Message()
	{
		System.out.println("Welcome to high Class.. ");
	}
}
public class Abstract {

	public static void main(String[] args) {
		/*Here We cannot create a object for Hotel because Hotel is Abstract class (Abstract class is most common 
		  so we can't create object for abstract class*/
	//	Hotel h=new Hotel(); 
		Hotel[] h=new Hotel[3];  //Object into Array
		h[0]=new HighClass(); //Here creating Object for subclass with Array of Base Class Object(h)
		h[1]=new MediumClass();
		h[2]=new HighClass();
		
		for(Hotel h1:h)
		{
			h1.Message(); // We call the abstract Method(Message)
		}


	}

}
