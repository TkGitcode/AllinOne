package Map;

import java.util.HashMap;
import java.util.Map;

/** 
* @Author -- TkGitcode
*/
/*Technique is Hashing
 * Duplicate keys or Not allowed but Duplicate values are Allowed
 * Only one null values are allowed
 * Insertion Order is Not MaintainedS
 * We can Only take a Value by the Key Reference
 * It is Not a Synchronization
 * Initial Capacity is 16*/
public class Hashmap {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		HashMap<Integer/*KeyWord*/,String/*Value*/> hm=new HashMap<>();

		hm.put(1,"Hii"); //It is also know as KEY+VALUE = ENTRY 
		hm.put(5,"kumar");
		hm.put(null,"kumar");
		hm.put(7,"kumar");
		hm.put(5, null); //If we add duplicate value in HashMap it will take last add(Duplicated value) as a Main Value
		Map <Integer,String> hm1=new HashMap<>();
		hm1.putAll(hm); //Putting is known as Putting a value in one List to Another List
		System.out.println(hm1);
		hm1.clear(); //Clear is Used to clear the Map
		/*Checking a Given Key value  is in present in HashMap Key Value or Not */
		System.out.println("Checking a Given Key value  is in present in HashMap Key Value or Not "+hm.containsKey(7));
		/*Checking a Given  value  is in present in HashMap  Value or Not */
		System.out.println("Checking a Given  value  is in present in HashMap  Value or Not "+hm.containsValue("Bala"));
		/*When we Using Clone we Should use Cast */
		hm1=(Map<Integer, String>) hm.clone();//Same as PutAll,Clone also Copy a one HashMap value to another HashMap 
		System.out.println("keys in HashMap "+hm.keySet());//KeySet Gives a Key value of HashMap
		System.out.println("Values in HashMap "+hm.values());//values Gives a  values of HashMap
		System.out.println("get() "+hm.get(1));//Using get passing a Key value as a parameter and getting the value of Key
		System.out.println("Entery set "+hm.entrySet());//Entry set is used to print all the ENTRY in HashMap
		
	}

}
