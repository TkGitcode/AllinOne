import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/

class Calculator
{
	public int a_value;
	public int b_value;
	Calculator(int a,int b)
	{
		a_value=a;
		b_value=b;
	}
	void setval(int a,int b)
	{
		a_value=a;
		b_value=b;
	}
	int get_a()
	{return a_value;}
	int get_b()
	{return b_value;}
	int rem()
	{
		return a_value%b_value;
	}
}
class addition extends Calculator
{
	addition(int aa,int bb)
	{
	super(aa,bb);
	}
	int add()
	{
		return super.get_a()+super.get_b();
	}
	int sub()
	{
		return super.get_a()-super.get_b();
	}
}
public class InheritanceEx1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Value of A ");
		int a=sc.nextInt();
		System.out.println("Enter a Value of B ");
		int b=sc.nextInt();
		Calculator cal=new Calculator(a,b);
		addition ad=new addition(a,b);
		System.out.println("Additio :"+ad.add()+"\n"+"Subtraction :"+ad.sub()+"\nModulo :"+ad.rem());
		//cal.setval(45,85);
		sc.close();
	}

}
