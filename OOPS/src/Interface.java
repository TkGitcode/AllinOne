/** 
* @Author -- TkGitcode
*/
/*Interface is What to do but Not how to do*/
/*Interface is overcome from abstract*/
interface Ola /*we can't  create Instance variable inside the interface*/
{
	int MAX=90; //In interface class Every Variable are consider as Final and Static so we must need to declare a variable value
	void Book();  //Inside the Interface  All Methods are Abstract and Public
	
	default void display() /*Here when we using default keyword in Interface we can use a Method without abstract*/
	{
		System.out.println("Hello from Interface ");
	}
}
class olabike  implements Ola
{
	public void Book()  //Here we must need give Access Modifier as Public to access any where using package 
	{
		System.out.println("You Booked Ola Bike");
	}
	@Override
	public void display()
	{
		System.out.println("Hello from bike class");
	}
	
	
}
class olacar implements Ola
{
	public void Book()
	{
		System.out.println("You Booked Ola car");
	}
}
 class Booking
 {
	 void update(Ola a)
	 {
		 System.out.println("Booking....");
		 a.Book();
	 }
	

 }
public class Interface {

	public static void main(String[] args) {
		 //  Ola a=new Ola(); //Here we cant't create a Object for Interface class
		
         Booking b=new Booking();
         olacar oc =new olacar();
         olabike ob=new olabike();
         b.update(oc);
         b.update(ob);
         
         oc.display(); /*Here i am Calling a display method from interface using olacar class(oc) because olacar implements Ola interface*/
         ob.display(); /*Here i have override a method from olacar class*/


	}

}
