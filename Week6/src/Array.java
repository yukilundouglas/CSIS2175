
public class Array {

	public static void main(String[] args) {
		// double[10] sales // it is pointing to null
		final int SIZE = 10;
		//int x = 10;
		double[] sales; //no memory is allocated
		sales = new double [SIZE]; //inside the [] must be an integer
		//sales = {0,1,2,3,4,5,6,7,8,9,0}; // you cannot initialize after declaration
		sales[0] = 10;
		for(int i = 0; i < sales.length; i++) {
			System.out.println(sales[i]);
		}
		//Initialization list
		
		int[] numbers = {3,5,6,8,9,0}; //no need new operator and specifying the size
		
		int[] numbers2 = numbers;
		
		numbers2[2] = 56;
		
		//enhanced for loop
		for(int num : numbers) {
			System.out.print(num + "\s");
		}
		
		System.out.println();
		
		for(int num : numbers) {
			System.out.print(num + "\s");
		}
		
		System.out.println();
		
		String[] strings = {"Java", "JavaScript", "C#", "Python"}; //this would be array of object with address pointing to string
		for(String str : strings) {
			System.out.print(str + "\s");
		}
	}

}
