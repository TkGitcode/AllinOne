/** 
* @Author -- TkGitcode
*/

final class Complex
{
	private final double re;
	private final double im;
	public Complex (double re,double im)
	{
		this.re=re;
		this.im=im;
	}
	public int  toInt()
	{
		return  9 ; //"(" + re + "  +  " + im + "i)";
	}
	public String  toString()
	{
		return  "(" + re + "  +  " + im + "i)";
	}
}
public class polymorphism {

	public static void main(String[] args) {
		Complex c=new Complex(10,15);
		System.out.println("Complex number is " + c);
		//String d=c.toString();
		//System.out.println("Complex number is " + d);

	}

}
