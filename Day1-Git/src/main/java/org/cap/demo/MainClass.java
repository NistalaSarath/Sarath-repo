package org.cap.demo;

public class MainClass {

	public static void main(String[] args) {
		SalesClass class1 = new SalesClass();
		BranchClass1 class2 = new BranchClass1();
		BranchClass2 class3 = new BranchClass2();
		BranchClass3 class4 = new BranchClass3();
		
		System.out.println("Hello World!");
		greet();
		class1.show();
		class2.display();
		class3.disp();
		class4.show1();

	}
	public static void greet() {
		System.out.println("Hello");
		System.out.println("Good Morning");
		System.out.println("Good Afternoon");
		System.out.println("Good Evening");
		System.out.println("Good Night");
	}

}
