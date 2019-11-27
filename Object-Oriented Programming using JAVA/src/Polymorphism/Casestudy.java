package Polymorphism;

import java.util.Scanner;

public class Casestudy {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		car a = new car();
		bike b = new bike();
		System.out.println("1)Car\n2)Bike");
		int n = s.nextInt();
		switch(n) {
		case 1:
			a.displayDetails();
			break;
		case 2:
			b.displayDetails();
			break;
		default:
			System.out.println("Invaild Option");
			break;
		
		}

	}

}

class car extends Vehicle{
	Scanner s = new Scanner(System.in);
	
	public void displayDetails() {
		System.out.println("Enter the details of car");
		System.out.println("Enter the color");
		String color = s.next();
		System.out.println("Enter the maximum speed");
		String max = s.next();
		System.out.println("Enter the number of seats");
		String seats = s.next();
		System.out.println("Enter the number of wheels");
		String wheels = s.next();
		System.out.println("Enter the number of doors");
		String doors = s.next();
		System.out.println("Enter the status of AC(true/false");
		String status = s.next();
		System.out.println("Car Details");
		System.out.println("color"+color);
		System.out.println("Maximum Speed"+max);
		System.out.println("Number of Seats"+seats);
		System.out.println("Number of Wheels"+wheels);
		System.out.println("Number of Doors"+doors);
		System.out.println("AC:"+status);
		
	}
	}
class bike extends Vehicle{
	Scanner s = new Scanner(System.in);
	
	public void displayDetails() {
		System.out.println("Enter the details of bike");
		System.out.println("Enter the color");
		String color = s.next();
		System.out.println("Enter the maximum speed");
		String max = s.next();
		System.out.println("Enter the number of seats");
		String seats = s.next();
		System.out.println("Enter the number of wheels");
		String wheels = s.next();
		System.out.println("Enter the status of diskbreak(true/false)");
		String status = s.next();
		System.out.println("Car Details");
		System.out.println("color"+color);
		System.out.println("Maximum Speed"+max);
		System.out.println("Number of Seats"+seats);
		System.out.println("Number of Wheels"+wheels);
		System.out.println("DiskBreak:"+status);
		
	}
	}

class Vehicle
{

	}
	

