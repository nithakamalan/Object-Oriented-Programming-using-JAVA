package Encapsulation;

public class Ticketb1 {
	int Price;
	int Person;
	String Name;
	String Gender;
	int Age;
	int i=1,j=0;
	double total=0,sum=0;
	public int getPrice() {
	return Price;
	}
	public void setPrice(int Price) {
	this.Price = Price;
	}
	public int getPerson() {
	return Person;
	}
	public void setPerson(int Person) {
	this.Person = Person;
	}
	public int getI() {
	return i;
	}
	public void setI(int i) {
	this.i = i;
	}
	public String getName() {
	return Name;
	}
	public void setName(String Name) {
	this.Name = Name;
	}
	public String getGender() {
	return Gender;
	}
	public void setGender(String Gender) {
	this.Gender = Gender;
	}
	public int getAge() {
	return Age;
	}
	public void setAge(int Age) {
	this.Age = Age;
	}
	public void ticket(int Person, int Price) {
	System.out.printf("Ticket Details are:\n");
	System.out.printf("Number of Passengers:%d\n",Person);
	System.out.printf("Price of a ticket:%d\n",Price);
	}
	double ticket1(int Age, String Gender,int Person,int Price) {
	j++;
	total=0;
	double Old=0.25,Ladies=0.10,Children=0.50;
	if(Age<16)
	{
	total=(double)sum+(Price-(Price*Children));
	sum=total;
	return total;
	}
	else if(Gender.contentEquals("F")==true && Age>=16)
	{
	total=sum+(Price-Price*Ladies);
	sum=total;
	return total;
	}
	else if(Age>64)
	{
	total=sum+(Price-Price*Old);
	sum=total;
	return total;
	}
	else
	{
	total=sum+Price;
	sum=total;
	return total;
	}



	}
	}


