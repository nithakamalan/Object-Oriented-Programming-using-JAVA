package Encapsulation;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Customer1 a = new Customer1();
		Display d = new Display();
		System.out.println("Enter the name");
		a.setName(s.next());
		System.out.println("Enter the address");
		a.setAddress(s.next());
		System.out.println("Enter the Contact Number");
		a.setContactNumber(s.next());
		System.out.println("Enter the Email");
		a.setEmail(s.next());
		System.out.println("Enter the ProofType");
		a.setProofType(s.next());
		System.out.println("Enter the ProofID");
		a.setProofID(s.next());
		d.display(a.getName(),a.getAddress(),a.getContactNumber(),a.getEmail(),a.getProofType(),a.getProofID());
		
		
	}

}
