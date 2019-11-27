package Inheritance;
import java.util.Scanner;

public class Lean_Season extends Booking_new{
	int persons,total_Day,tariff,rate;
	String room_type;
	int month,discount;
	public void roomBooking(int persons, int total_Days, int tariff, String room_type, int month, int discount) {
		// TODO Auto-generated method stub
		int cost=book(persons,total_Days,tariff,room_type);
		rate=(discount/100)*cost;
		System.out.println("total Tariff :" +rate);
		
	}
	

}
