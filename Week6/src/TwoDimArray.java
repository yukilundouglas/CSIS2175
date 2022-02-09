
public class TwoDimArray {

	public static void main(String[] args) {
		
		int[][] rents = { {400, 450, 510}, 
				  {500, 560, 630},
				  {625, 676, 740},
				  {1000, 1250, 1600} };

		
		for (int[] floors:rents){
			for(int bdrm: floors) {
				System.out.println(bdrm);
			}
		}
		
		int[] num1 , num2, num3; // all are arrays
		// int num1 [], num2, num3; // the first one is an array, the second and third are integer
	}

}
