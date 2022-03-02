package lecture;

import java.util.Scanner;

public class EnumDemo {

	public static void main(String[] args) {
		Day today;
		today = Day.TUE; //this is different from "TUE"
		Scanner input = new Scanner (System.in);
		
		for(Day d: Day.values()) {
			System.out.println(d);
		}
		
		System.out.println("What day is today? (Enter only the first three character)");
		String newDay = input.nextLine().toUpperCase();
		Day userInput = Day.valueOf(newDay);
		
		switch(userInput) {
			case SUN: 
				System.out.println("It is Sunday");
				break;
			case MON:
				System.out.println("IT is Monday");
				break;
			default:
				System.out.println("It is invalid.");
				
		}
		
		input.close();
	}

}
