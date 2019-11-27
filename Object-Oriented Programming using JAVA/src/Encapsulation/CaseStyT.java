package Encapsulation;

import java.util.Scanner;

public class CaseStyT {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Ticketb1 b=new Ticketb1();
		int a,i,j=1,k=1;
		System.out.println("Enter Price of Ticket");
		b.setPrice(s.nextInt());
		System.out.println("Enter No of Person");
		b.setPerson(s.nextInt());
		a=b.getPerson();
		String Name[]=new String[25];
		String Gender[]=new String[10];
		int Age[]=new int[5];
		int x=a;
		for(i=0;i<a;i++)
		{
		System.out.printf("Enter Details for Person%d\n",j);
		j++;
		System.out.println("Enter Name");
		b.setName(s.next());
		String na=b.getName();
		Name[i]=na;
		System.out.println("Enter Gender(F/M)");
		b.setGender(s.next());
		String ge=b.getGender();
		Gender[i]=ge;
		System.out.println("Enter Age");
		b.setAge(s.nextInt());
		int ag=b.getAge();
		Age[i]=ag;
		}
		
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
		System.out.printf("\nPassenger Details:\n");
		int q=1;
		for(i=0;i<x;i++)
		{
			System.out.printf("%d)%s(%s %d)\n",q,Name[i],Gender[i],Age[i]);
			q++;
		}
		
		
		}

	

}
