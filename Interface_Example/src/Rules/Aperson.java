package Rules;
/** 
* @Author -- TkGitcode
*/
public class Aperson implements CompanyRules,OwnRules {
	String WFH;
    int Increment;
    String Chkin_Chkout;
    String DailyWorkout;
    int DailyWaterConsumption;
	Aperson(String DW,int DWC,String WFH,int Icr,String CICO)
	{
		DailyWorkout=DW;
		DailyWaterConsumption=DWC;
		this.WFH=WFH;
		Increment=Icr;
		Chkin_Chkout=CICO;
	}
	
	 public String WFH()
	 {
		return WFH;
		 
	 }
	    public int Increment()
	    {
			return Increment;
	    	
	    }
	    public String Chkin_Chkout()
	    {
			return Chkin_Chkout;
	    	
	    }
	    public String DailyWorkout()
	    {
			return DailyWorkout;
	    }
	     public int DailyWaterConsumption()
	     {
			return DailyWaterConsumption;
	    	 
	     }
}
