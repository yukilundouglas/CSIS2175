package Inheritance;

class A {
	public static void m1() {
		System.out.println("Parent");
	}
	
}

class B extends A {
	public static void m1() {
		System.out.println("Child");
	}
	
}

public class StaticMethodOverriding {

	public static void main(String[] args) {
		A aRef = new B(); //variable of parent class, which is an object in child class
		A.m1(); //Parent
		aRef.m1(); //Parent - static method is resulted during compile time when non-static method is resulted during run time
		((B)aRef).m1(); // we can cast variable from A to B

	}

}
