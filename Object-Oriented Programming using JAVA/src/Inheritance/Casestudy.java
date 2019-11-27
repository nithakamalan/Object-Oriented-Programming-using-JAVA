package Inheritance;
import java.util.Scanner;

public class Casestudy {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the number of persons");
        int persons = s.nextInt();
        System.out.println("Enter the number of days");
        int total_Days = s.nextInt();
        System.out.println("Enter the room type");
        String room_type = s.next();
        System.out.println("Enter the tariff for single person");
        Double tariff = s.nextDouble();
        Season_booking b = new Season_booking();
        b.roombooking(persons, total_Days, tariff,room_type);
	}

}
