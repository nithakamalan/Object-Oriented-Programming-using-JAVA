package Polymorphism;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Details x = new Details();
		System.out.println("Enter the Name");
		String name = s.nextLine();
		System.out.println("Enter the Rollno");
		int rollno = s.nextInt();
		System.out.println("Enter the Department");
		String dept = s.next();
		System.out.println("Enter the Year");
		int year = s.nextInt();
		System.out.println("Enter the Mark1");
		int a = s.nextInt();
		System.out.println("Enter the Mark2");
		int b = s.nextInt();
		System.out.println("Enter the Mark3");
		int c = s.nextInt();
		System.out.println("Enter the Mark4");
		int d = s.nextInt();
		System.out.println("Enter the Mark5");
		int e = s.nextInt();
		x.Details(name);
		x.Details(rollno,dept,year);
		x.Details(a,b,c,d,e);
		
	}

}
