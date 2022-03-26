import java.util.Arrays;

/** 
* @Author -- TkGitcode
*/
class Employee implements Comparable<Employee> //here i implements a Comparable(interface) to compare the object with the specific parameter
{
	int Val;
	String Name="";
	Employee(int a,String a1) //Here I create a Constructor get and set a value for Employee
	{
		Val=a;
		Name=a1;
		
	}
	String getName()
	{
		return Name; //return Name
	}
	int getVal()
	{
		return Val; //Return Val
	}
	public int compareTo(Employee e) {
		if(Val==e.Val)
			return 0; //when both object value is correct the returns 0
					if(Val<e.Val)
						return -1; //when Present class object value is less than passing object then returns -1
					return 1; //when Present class object value is greater than passing object then returns 1
	}
}
public class CompareTo {

	public static void main(String[] args) {
		//Employee e=new Employee();
		
		Employee[] e1=new Employee[3];
		e1[0]=new Employee(1455,"Kumar");
		e1[1]=new Employee(1485,"Sofhy");
		e1[2]=new Employee(1864,"Naramth");
		e1[3]=new Employee(1889,"Nani");
		e1[4]=new Employee(1963,"Sara");
		
	Arrays.sort(e1); //sorting the object with specific parameter
     for(Employee e:e1)
     {
    	 System.out.println(e.Name + " "+ e.Val);
     }
	}

}
