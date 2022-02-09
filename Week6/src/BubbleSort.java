
public class BubbleSort {

	public static void main(String[] args) {

		int[] nums = {4,6,1,2,9,22};
		
		System.out.println("Before Sorting: ");
		
		for(int num: nums) {
			System.out.print(num + "\s");
		}
		
		//bubble(emps); // **Practice to sort an array of Objects / String
		
		for (int i = 0; i < nums.length - 1; i++) {  //number of rounds/passes
			
			for (int j = 0; j < nums.length - 1; j++) { //number of comparisons
				if(nums[j] > nums[j+1]) {
					int temp = nums [j];
					nums[j] = nums [j+1];
					nums[j+1] = temp;
				}
			}
			
		}
		
		System.out.println("\nAfter Sorting: ");
		
		for(int num: nums) {
			System.out.print(num + "\s");
		}
		

		
	}

}
