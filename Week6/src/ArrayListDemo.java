import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		ArrayList aList = new ArrayList();
		
		aList.add(1);
		aList.add(10.4);
		aList.add("Anu");
		
		System.out.println(aList);
		
		for(Object val:aList) {
			System.out.println(val);
		}
		
		names.add("Christy");
		names.add("John");
		names.add("Anu");
		names.add("Leo");
		
		for(String name:names) {
			System.out.println(name);
		}
		
		System.out.println(names);
		names.remove(1);
		names.set(0,"Mary");
		System.out.println(names);	
		System.out.println("The size of the arraylist: "+ names.size());
		
	}

}
