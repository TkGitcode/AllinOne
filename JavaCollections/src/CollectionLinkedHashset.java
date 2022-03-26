import java.util.*;

/** 
* @Author -- TkGitcode
*/
/*1)Set will Not Allow Duplicate
 2)In Set We can add null value
 3)In HashSet Insertion Order Will be Maintained
 4)In set,The element will store according to hashcode so Searching is Effective
*/
public class CollectionLinkedHashset {

	public static void main(String[] args) {
		List ar= new ArrayList(); //Here i am creating a ArrayList 
		/*Here i am inserting a Some duplicate value*/
		ar.add(45);
		ar.add(75);	
		ar.add(45);
		ar.add(456);
		LinkedHashSet<Object> h=new LinkedHashSet<>(ar); //Converting ArrayList to  HashSet
		h.add(778);
		System.out.println(h); //if there is a duplicate value in HashSet it will not allow to store 
		//And it Maintain a Insertion Order 
	}

}
