package Polymorphism;

import java.util.Scanner;

public class Casestudy2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		TelePhoneBill tb = new TelePhoneBill();
		Currentbill cb = new Currentbill();
		System.out.println("Enter the Telephone Bill Number :");
		int id =s.nextInt();
		System.out.println("Enter the Customer Name  :");
		String name =s.next();
		System.out.println("Enter the Number of Calls made  :");
		int cm =s.nextInt();
		System.out.println("Enter the Cost per Call  :");
		float pc =s.nextFloat();
		System.out.println("Enter the Current Bill Number  :");
		int b =s.nextInt();
		System.out.println("Enter the Customer Name  :");
		String name1 =s.next();
		System.out.println("Enter the Number of Units Consumed  :");
		int u =s.nextInt();
		System.out.println("Enter the Cost per Unit  :");
		float pu =s.nextFloat();
		tb.generateBill(id,name,cm,pc);
		cb.generateBill(b,name1,u,pu);
	
	}
}
	