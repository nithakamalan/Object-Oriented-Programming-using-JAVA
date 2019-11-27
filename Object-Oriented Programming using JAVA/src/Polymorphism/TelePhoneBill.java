package Polymorphism;

public class TelePhoneBill extends Bill {
	
	
	
	public void generateBill(int id, String name, int cm, float pc ) {
	
	float amount=cm*pc;
	System.out.println("BillNumber:"+id);
	System.out.println("Customer Name:"+name);
	System.out.println("Telephone Bill Amount:"+amount);
	
	
	}
	
}

