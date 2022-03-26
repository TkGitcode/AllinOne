import java.util.Iterator;
import java.util.TreeSet;

/** 
* @Author -- TkGitcode
*/
/*1) Insertion Order Will Returns the accenting Order
  2) DS-It is Binary Search
  3) Tree Does not allow a Heterogeneous object Because All Element Should be comparable Ex: if(1=='a') Not true so, That 
  tree does not allow a Heterogeneous object
  4)Tree Don't allow a Duplicate value
  */
public class CollectionTreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> t=new TreeSet<>(); //In Tree set We only can add a Specific Object like Integer,String,float,etc..
		//t.add(null); //If we add "null" in the list It Not Accepts 
		t.add(54);
		t.add(1);
		t.add(10);
		t.add(885);
		t.add(3);
		t.add(885);
		t.add(2);
		System.out.println(t); //Tree prints a value with Ascending order
		System.out.println(t.first());//.first() prints First element of TreeList
		
		System.out.println(t.last());//.last() prints Last element of TreeList
		
		System.out.println(t.headSet(3)); //.HeadSet will returns, if we give value 3 then it take lesser than 3 Values from the list
		
		System.out.println(t.tailSet(10));//.tailSet is given a Equal or Greater value from TreeList which you given in tailSet
		
		System.out.println(t.subSet(5, 80)); //Subset gives In between Value of SubSet (start from given value ends before End Value)
	     
		System.out.println(t.comparator()); //If the default Sorting is Happened in TreeSet then It prints "Null"
		//if we set some specific order to the list then it print
		
		System.out.println(t.higher(25)); //.higher() prints, The value Which we given inside the higher() it given Next Highest value 
       
		System.out.println(t.lower(25)); //.lower() prints, The value Which we given inside the lower() it given Next lower value 
		
		System.out.println(t.pollFirst()); //In TreeSet PollFirst() Print a First Element and Remove a First Element
		
		System.out.println(t.pollLast()); //In TreeSet pollLast() Print a last Element and Remove a last Element
		
		System.out.println(t.descendingSet()); //.descendingSet is to print a List in Descending order(Higher to Lower)
		System.out.println("Iterator"); //Normal Iterator 
		Iterator i=t.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		System.out.println("Descending Iterator"); //Descending order Iterator
		Iterator i1=t.descendingIterator();
		while(i1.hasNext())
			System.out.println(i1.next());
		/*Here I am creating treeSet by Reference of StringBuffer as Object*/
		TreeSet<StringBuffer> t1=new TreeSet<>();
		t1.add(new StringBuffer("Ballon"));
		t1.add(new StringBuffer("Apple"));
		t1.add(new StringBuffer("Abuuu"));
		System.out.println(t1); //Given Output by Sorted
		}
	
         


}
