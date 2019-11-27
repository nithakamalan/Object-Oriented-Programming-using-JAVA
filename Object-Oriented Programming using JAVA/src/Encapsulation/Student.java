package Encapsulation;
import java.util.Scanner;
public class Student {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Student1 a = new Student1();
		System.out.println("Enter the Name");
		a.setName(s.next());
		System.out.println("Enter the Id");
		a.setId(s.nextInt());
		System.out.println("name :" +a.getName());
		System.out.println("Id :" +a.getId());
		
		

	}

}
