package Inheritance;

public class Booking_new {
	int persons,total_Day,tariff,rate;
	String room_type;
	public int book(int persons, int total_Days, int tariff, String room_type) {
		// TODO Auto-generated method stub
		int t;
		if(room_type=="AC")
		{
			t=500;
		}
		else 
			
			t=150;
			int set = persons*total_Days*t;
		
		return set;
	}
}
