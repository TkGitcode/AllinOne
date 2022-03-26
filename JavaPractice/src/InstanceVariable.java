/** 
* @Author -- TkGitcode
*/
public class InstanceVariable {
  
	public String name;
	public String colname;
	
    public  InstanceVariable (String na)
    {
    	name = na;
    	
    }
    public void na1(String na)
    {
    	colname = na;
    }
    public void prnt()
    {
    	System.out.print(name);
    	System.out.print(colname);
    }
	
	public static void main(String[] args) {
		InstanceVariable I = new InstanceVariable("Name");
		I.na1(":");
		I.prnt();

	}

}
