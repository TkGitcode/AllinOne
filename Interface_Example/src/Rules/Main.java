package Rules;

import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
public  class Main  {
     
	 public static String YesOrNo(int n)
	 {
		 if(n==1)
		return "Yes";
		 
		return  "No";
		 
	 }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int yn;
		System.out.println("Did You  Workouted Today? if Yes 1 or 0");
	    yn=sc.nextInt();
		String Workouted=YesOrNo(yn);
		System.out.println("How much Ltr of Water Consumped? Enter the ltr You Takeen");
		int Water=sc.nextInt();
		System.out.println("Are you in WFH? if Yes 1 or 0");
		yn=sc.nextInt();
		String WFH=YesOrNo(yn);
		System.out.println("Did You get Increment for This Year and How Much? How much Did You get");
		int Increment=sc.nextInt();
		System.out.println("Checkin or CheckOut? 1 to CheckIn 0 to CheckOut");
		yn=sc.nextInt();
		String Chkin_Chkout=YesOrNo(yn);
		Aperson a=new Aperson(Workouted,Water,WFH,Increment,Chkin_Chkout);
		System.out.println("Did You  Workouted Today? "+a.DailyWorkout());
	    System.out.println("How much Ltr of Water Consumped? "+a.DailyWaterConsumption());
	    System.out.println("Are you in WFH? "+a.WFH());
	    System.out.println("Did You get Increment for This Year and How Much? How much Did You get "+a.Increment());
	    System.out.println("Checkin or CheckOut? "+a.Chkin_Chkout());
	    sc.close();

	}

}
	