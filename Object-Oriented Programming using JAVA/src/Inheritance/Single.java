package Inheritance;
import java.util.Scanner;
public class Single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Bike b = new Bike();
		System.out.println("Enter the Name");
		String n = s.nextLine();
		b.name(n);
		System.out.println("Enter the Model");
		String m = s.nextLine();
		b.model(m);
		System.out.println("Enter the color");
		String c = s.nextLine();
	    b.color(c);
	}

}
