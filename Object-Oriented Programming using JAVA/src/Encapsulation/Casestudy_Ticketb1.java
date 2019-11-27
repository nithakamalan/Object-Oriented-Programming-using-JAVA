package Encapsulation;
import java.util.Scanner;

public class Casestudy_Ticketb1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Ticketb1 b=new Ticketb1();
		int PersonCount,i=1,k=1;
		System.out.println("Enter Price of Ticket");
		b.setPrice(s.nextInt());
		System.out.println("Enter No of Person");
		b.setPerson(s.nextInt());
		PersonCount=b.getPerson();
		do {
		System.out.printf("Enter Details for Person%d\n",i);
		i++;
		System.out.println("Enter Name");
		b.setName(s.next());
		System.out.println("Enter Gender(F/M)");
		b.setGender(s.next());
		System.out.println("Enter Age");
		b.setAge(s.nextInt());
		PersonCount--;
		}
		while(PersonCount>0);
		b.ticket(b.getPerson(),b.getPrice());
		while(k<=b.getPerson())
		{
			
		double total=b.ticket1(b.getAge(),b.getGender(),b.getPerson(),b.getPrice());

		if(k==b.getPerson()) {

		System.out.printf("Total Amount=%.1f",total);
		break;
		}
		k++;
		}
		
		
		
		}

}