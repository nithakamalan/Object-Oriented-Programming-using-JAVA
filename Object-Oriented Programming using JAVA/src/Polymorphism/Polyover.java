package Polymorphism;
import java.util.Scanner;

public class Polyover {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Mark a = new Mark();
		int x = s.nextInt();
		int y = s.nextInt();
		int z = s.nextInt();
		a.Mark(x);
		a.Mark(x,y);
		a.Mark(x,y,z);

	}

}
