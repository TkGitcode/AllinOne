/** 
* @Author -- TkGitcode
*/
public class Short_byte_diff {

	/*Write a program to print the value of byteNumber of the following statements.
      short shortNumber = 150;
       byte byteNumber =(byte) shortNumber;
       */
	
	/* Short minimum value of -32,768 and a maximum value of 32,767 but byte minimum value of -128 and a maximum value of 127
	 * When we insert the value for short more than 127 there will be looping of byte space*/
	public static void main(String[] args) {
		short shortNo=150;
		byte bytenum= (byte) shortNo;
		System.out.print(bytenum);

	}

}
