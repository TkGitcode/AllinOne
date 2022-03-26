 package Map;

import java.util.LinkedHashMap;

/** 
* @Author -- TkGitcode
*/
/*LinkedHashMap is Similar to HashMap but only  one Difference is LikedHashMap Maintain a Insertion Order*/
public class LinkedHashmap {

	public static void main(String[] args) {
		LinkedHashMap<String,String> hll=new LinkedHashMap<>();
		/*Insertion Order is Maintained*/
		hll.put("Hello", "Hii");
		hll.put("Vanakam", "Vanthanam");
		hll.put("Empty", "full");
		hll.put(null, null);
		hll.put("Ji", null);
		System.out.println(hll);
	}

}
