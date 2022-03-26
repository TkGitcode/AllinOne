package Map;
import java.util.TreeMap;

/** 
* @Author -- TkGitcode
*/
 /*Null Keys are not Allowed 
 * The elements are retrieved on Natural Sorting Order(Based on Key Values)*/
public class Treemap {

	public static void main(String[] args) {
		TreeMap<String,String> hll=new TreeMap<>();
		/*Insertion Order is Maintained*/
		// hll.put(null, "Hii"); //null is Not Accepts Because Comparison is Happen in TreeMap so "null" is cannot be compare with other value
		hll.put("Vanakam", "Vanthanam");
		hll.put("Ampty", "full");
		hll.put("Ampty", "Hello");//If key is Duplicate value then will Override
		System.out.println(hll);

	}

}
