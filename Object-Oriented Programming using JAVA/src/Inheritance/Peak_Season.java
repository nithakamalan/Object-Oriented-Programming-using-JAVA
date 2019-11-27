package Inheritance;
import java.util.Scanner;

public class Peak_Season extends Booking_new {
	Scanner s = new Scanner(System.in);
	
	int persons,total_Day,tariff,rate;
	String room_type;
	int month,peakcharge;
	public void roomBooking(int persons, int total_Days, int tariff, String room_type,int month, int peakcharge) {
		// TODO Auto-generated method stub
		int cost=book(persons,total_Days,tariff,room_type);
		rate=cost+peakcharge;
		System.out.println("total Tariff :" +rate);
		
	}


}