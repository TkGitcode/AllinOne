
import java.util.*;

/**
 * @Author -- TkGitcode
 */
/*Collection Array list Not Easy to Search and Remove the Element or Not Better than LinkedList But Retrieving the Element from
 * List is faster than Linked List*/
/*Array List has Default Size() is 10*/
/*List will  Allow Duplicate*/
/*Insertion Order is Maintained*/
class CollectionArrayList {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> boys = new ArrayList<>();
		ArrayList<String> girls = new ArrayList<>();
		//Add All Example
		boys.add("Kannan");
		boys.add("Kumar");
		boys.add("Venkat");
		girls.add("Ramya");
		girls.add("Kavya");
		girls.add("Sowmiya");
		System.out.println("----addAll()----");
		boys.addAll(girls); //Adding a object value from girlsList(collection) into boysList(collection) from end
		
		//  boys.add(0, girls); //Adding a object value from girlsList(collection) into boysList(collection) from Index point
		Iterator<String> i= boys.iterator();
		while(i.hasNext())
			System.out.println(i.next());
			

		System.out.println("----removeAll()----"); //Removing a object value from boysList(collection) which is in girlsList(collection)
		boys.removeAll(girls);
		Iterator<String> i1= boys.iterator();
		while(i1.hasNext())
			System.out.println(i1.next());
		
		System.out.println("----retainAll()----");
		boys.add("Ramya");//I am Adding a Ramya value into boys because of my use
		
		boys.retainAll(girls);//retaining all is used to retain a same element which is present in girls and boys list that will retain into boys list
		Iterator<String> i2= boys.iterator();
		while(i2.hasNext())
			System.out.println(i2.next());
		System.out.println("----contains()----");
		System.out.println(girls.contains("Kavya")); //contains checks given element is in list if yes then print  'true' or 'false'
		System.out.println("----Indexof()----");
		System.out.println(girls.indexOf("Ramya")); //It print index of given object from the list
		System.out.println("----SubList()----");
        System.out.println(girls.subList(1, 2)); //SubList prints list value from startIndex to EndIndex which we given in parameter 
        List<Integer> l=new ArrayList<Integer>();
        l.add(78);
        l.add(888);
        l.add(87);
        System.out.println(l.lastIndexOf(87));
        
	sc.close();

	}

}
