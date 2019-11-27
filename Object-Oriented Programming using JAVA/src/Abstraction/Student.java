package Abstraction;
import java.util.Scanner;
public class Student {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Studen_t t = new Studen_t();
		System.out.println("Enter the Name");
		String name = s.nextLine();
		System.out.println("Enter the Rollno");
		int rollno = s.nextInt();
		System.out.println("Enter the Department");
		String dept = s.next();
		System.out.println("Enter the Year");
		int year = s.nextInt();
		System.out.println("Enter the Mark1");
		int a = s.nextInt();
		System.out.println("Enter the Mark2");
		int b = s.nextInt();
		System.out.println("Enter the Mark3");
		int c = s.nextInt();
		System.out.println("Enter the Mark4");
		int d = s.nextInt();
		System.out.println("Enter the Mark5");
		int e = s.nextInt();
		t.display(name,rollno,dept,year);
		t.totalmark(a,b,c,d,e);
		

	}

}
abstract class total{
	abstract void totalmark(int a,int b,int c,int d,int e);
	void display(String name,int rollno,String dept,int year) {
		System.out.println("Name :"+name);
		System.out.println("Rollno :"+rollno);
		System.out.println("Department :"+dept);
		System.out.println("Year :"+year);
		
		
	}
}
class Studen_t extends total{
	int total,avg;
	void totalmark(int a,int b,int c,int d,int e) {
		total=a+b+c+d+e;
		System.out.println("Total: "+total);
	    avg=total/5;
	    System.out.println("Average "+avg);
	    
	    if(total>450 && total<=500) {
	    	System.out.println("Rank 1");
	    }
	    else if(total>400 && total<=450) {
	    	System.out.println("Rank 2");
	    }
	    else if(total>350 && total<=400 ) {
	    	System.out.println("Rank 3");
	    }
	    else if(total>300 && total<=350) {
	    	System.out.println("Rank 4");
	    }
	    else {
	    	 
	 	    	System.out.println("Fail");
	 	    }
	    
	}
	
	
	
	
	
}