package Inheritance;

public class Booking {
	
	public void book(int persons, int total_Days, Double tariff, String room_type) {
		// TODO Auto-generated method stub
		double total_tariff=persons*total_Days*tariff;
		System.out.print("Total Tariff :"+total_tariff);
	}

	
}
