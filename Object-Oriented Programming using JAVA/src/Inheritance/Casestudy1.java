package Inheritance;

import java.util.Scanner;

public class Casestudy1 {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       
        System.out.println("Enter the number of persons");
        int persons = s.nextInt();
        System.out.println("Enter the number of days");
        int total_Days = s.nextInt();
        System.out.println("Enter the tariff per day");
        int tariff = s.nextInt();
        System.out.println("Enter the room type");
        String room_type = s.next();
        
        Peak_Season p = new Peak_Season();
        Lean_Season l = new Lean_Season();
        System.out.println("Enter the month");
        int month = s.nextInt();
        if(month==4||month==5||month==6||month==9||month==11||month==12) {
        	
        	System.out.println("Enter the peakcharge");
        	int peakcharge=s.nextInt();
        	p.roomBooking(persons,total_Days,tariff,room_type,month,peakcharge);
        	
        }
        else
        {
        	System.out.println("Enter the discount");
        	int discount=s.nextInt();
        	l.roomBooking(persons,total_Days,tariff,room_type,month,discount);
        }
        
	
              
      
       
        
	}

}
