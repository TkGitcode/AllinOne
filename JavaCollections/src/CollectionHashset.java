import java.util.*;


/** 
* @Author -- TkGitcode
*/
/*1)Set will Not Allow Duplicate
  2)HashSet  has Default Size() is 16
  3)In Set We can add null value
  4)In HashSet Insertion Order Is not Maintained
  5)In set,The element will store according to hashcode so Searching is Effective
 */
public class CollectionHashset {

	public static void main(String[] args) {
		ArrayList ar= new ArrayList(); //Here i am creating a ArrayList 
		/*Here i am inserting a Some duplicate value*/
		ar.add(45);
		ar.add(75);	
		ar.add(45);
		ar.add(456);
		HashSet h=new HashSet<>(ar); //Converting ArrayList to  HashSet
		h.add(778);
		System.out.println(h); //if there is a duplicate value in HashSet it will not allow to store 
		//And it  Not Maintain a Insertion Order 
	}

}
