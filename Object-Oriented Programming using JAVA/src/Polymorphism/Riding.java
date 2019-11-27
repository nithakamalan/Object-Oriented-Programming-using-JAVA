package Polymorphism;
import java.util.Scanner;
public class Riding {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		xyz q = new xyz();
		q.display();

	}

}
class abc{

	public void display() {
		System.out.println("parent class");
		
		
	}
	
}
class xyz extends abc{

	public void display() {
		super.display();
		System.out.println("child class");
	}
	
}

