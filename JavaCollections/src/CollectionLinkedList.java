import java.util.ArrayList;
import java.util.LinkedList;

/** 
* @Author -- TkGitcode
*/
/*Collection Linked list is Easy to Search and Remove the Element or Better than ArrayList But Retrieving the Element from
 * List is Slower than Array List*/
/*Linked List has Default Size() is 10*/
/*Insertion Order is Maintained*/
public class CollectionLinkedList{

	public static void main(String[] args) {
		LinkedList<Object> l1=new LinkedList<>();
		LinkedList<Object> l2=new LinkedList<>();
		ArrayList<Object> Arraylist=new ArrayList<>();
		//ArrayList
		Arraylist.add(88);
		Arraylist.add(7798);
		//LinkedList
		l1.add(78);//add() for add a Element in List
		l1.peek();//peek() to get a Element which is in First position
		l2=(LinkedList)l1.clone();//Clone a Object(ll) to Object (l2)
		System.out.println(l2);
		l1.poll();//remove a head Element in Array
		l1.pollFirst();//remove a First Element in Array
		l1.pollLast();//remove a last Element in Array
		l1.peek();//peek() gives value which is in first
		l1.peekFirst();//peekFirst() to get a Element which is in First position
		l1.peekLast();//peekLast() to get a Element which is in last position
		LinkedList<Object> l3=new LinkedList<>(Arraylist); //Here al is ArrayList I am converting a Array list to LinkedList
		System.out.println(l3.peek());
		

	}

}
