package Interface;
import java.util.Scanner;

public class Casestudy {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Customer c = new Customer();
		System.out.println("Registration");
	    System.out.println("Enter your name");
	    String name=s.next();
	    System.out.println("Enter your address");
	    String addr=s.next();
	    System.out.println("Contact Number");
	    int num=s.nextInt();
	    System.out.println("Email");
	    String email=s.next();
	    System.out.println("Enter proofType");
	    String proof=s.next();
	    System.out.println("Enter proofid");
	    String proofid=s.next();
	    c.display(name,addr,num,email,proof,proofid);
	    c.update(name,addr,num,email,proof,proofid);

	}

}
interface info{
	public void display(String name,String addr,int num,String email,String proof,String proofid);
}
interface updateemail{
	public void update(String name,String addr,int num,String email,String proof,String proofid);
	}
class Customer implements info,updateemail{

	
	public void display(String name, String addr, int num, String email, String proof, String proofid) {
		
		int i=0;
		System.out.println("Name :"+name);
		System.out.println("Address :"+addr);
		System.out.println("ContactNumber :"+num);
		System.out.println("Email :"+email);
		System.out.println("ProofType :"+proof);
		System.out.println("ProofID :"+proofid);
		System.out.println("Thank you for registering. Your id is"+i);
	}
	public void update(String name, String addr, int num, String email, String proof, String proofid) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Do you want to continue registration?(y/n)");
		String n = s.next();
		if (n.equals("n")==true || n.equals("y")==true)
		{
		   System.out.println("Do you want to update the email id?(y/n)");
		   String yes=s.next();
		   if(yes.equals("y")==true) {
		   System.out.println("Update Email");
		   System.out.println("Enter new Email id:");
		   String email1=s.next();
		   email=email1;
		   System.out.println("Email updated");
		}
		   System.out.println("Your details are as follows");
		   System.out.println("Name : "+name);
		   System.out.println("Address : "+addr);
		   System.out.println("Contact Number : "+num);
		   System.out.println("Email : "+email);
		   System.out.println("ProofType :"+proof);
		   System.out.println("Proofid : "+proofid);
		}
		   
		
	}

	
	}

	
		
	


