import java.util.Random;

public class Ass3_3 {
 
	 public static char[] randompassword(String cust_name,String cust_age,String cust_id,int length)
	 {
	 String combinedword = cust_name+cust_age+cust_id;
	 Random random = new Random();
	 char[] password = new char[length];
	 password[0] = cust_name.charAt(random.nextInt(cust_name.length()));
	 password[1] = cust_age.charAt(random.nextInt(cust_age.length()));
	 password[2] = cust_id.charAt(random.nextInt(cust_id.length()));

	 for(int i = 3; i< length ; i++) {
	 password[i] = combinedword.charAt(random.nextInt(combinedword.length()));
	 }
	 return password;
	 }
	 public static void main(String... args)
	 {
	 String cust_name = "kumar";
	 String cust_age = "22";
	 String cust_id = "55";
	 int length = 8;
	 System.out.print(randompassword(cust_name,cust_age,cust_id,length));
 }
}
