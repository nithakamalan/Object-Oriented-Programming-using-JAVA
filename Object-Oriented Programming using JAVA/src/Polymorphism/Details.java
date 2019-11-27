package Polymorphism;

public class Details {
	int total,avg;

	public void Details(String name) {
		System.out.println("Name: "+name);
		
		
	}

	public void Details(int rollno, String dept, int year) {
		System.out.println("Rollno: "+rollno);
		System.out.println("Department: "+dept);
		System.out.println("Year: "+year);
		
	}

	public void Details(int a, int b, int c, int d, int e) {
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

