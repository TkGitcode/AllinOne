/** 
* @Author -- TkGitcode
*/
public class NotEligible extends Exception {
    int MarkNeeded;
    NotEligible(int MN)
    {
    	MarkNeeded=MN;
    	System.err.println("You Need Still "+MarkNeeded+" To Eligible");
    }
}
