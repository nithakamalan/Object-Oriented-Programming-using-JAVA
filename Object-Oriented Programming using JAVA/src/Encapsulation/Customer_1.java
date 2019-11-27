package Encapsulation;

public class Customer_1 {
	String name;
	 String address;
	 String contactNumber;
	 String email;
	 String proofType;
	 String proofID;
	 int a=1,b=1,c=1,d=1,e=1,f=1;
	 
	public String getName() {
		return name;
	}
	public boolean setName(String name) {
		if (name.matches("^[a-z A-Z]*$"))
        {
            this.name=name;
            return true;
        }
        else
        {
            a=0;
            return false;
        }
		
		
	}
	public String getAddress() {
		return address;
	}
	public boolean setAddress(String address) {
	
		if (address.matches("^[a-z A-Z]*$"))
        {
            this.address=address;
            return true;
        }
        else
        {
            b=0;
            return false;
        }
		
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public boolean setContactNumber(String contactNumber) {
		
		 if (contactNumber.matches("^[0-9]*$"))
         {
             this.contactNumber=contactNumber;
             return true;
         }
         else
         {
            c=0;
             return false;
         }
	}
	public String getEmail() {
		return email;
	}
	public boolean setEmail(String email) {
		
		if (email.contains("@"))
        {
            this.email=email;
            return true;
        }
        else
        {
            d=0;
            return false;
        }
	}
	public String getProofType() {
		return proofType;
	}
	public boolean setProofType(String proofType) {
		this.proofType = proofType;
		if (proofType.matches("^[a-z A-Z]*$"))
        {
			this.proofType = proofType;
            return true;
        }
        else
        {
           e=0;
            return false;
        }
	}
	public String getProofID() {
		return proofID;
	}
	public boolean setProofID(String proofID) {
		
		if (proofType.matches("^[a-z A-Z 0-9]*$"))
        {
			this.proofID = proofID;
            return true;
        }
        else
        {
            f=0;
            return false;
        }
	}
	
	
	public void customer_2() {
		
	 if(a==1&&b==1&&c==1&&d==1&&e==1&&f==1) {
		 display(getName(),getAddress(),getContactNumber(),getEmail(),getProofType(),getProofID());
		 System.out.println("Registration Sucessful");
		 
	 }
		 else {
		 
		if(a==0) {
			System.out.println("Invalid Name");
		}
		if(b==0) {
			System.out.println("Invalid Address");
		}
		if(c==0) {
		System.out.println("Invalid ContactNumber");
		}
		if(d==0) {
			System.out.println("Invalid Email");
		}
		if(e==0) {
			System.out.println("Invalid ProofType");
		}
		if(f==0) {
			System.out.println("Invalid ProofID");
		}
		System.out.println("Registration Failed");
		
		}
		
	}
	public void display(String name, String address, String contactNumber, String email, String proofType, String proofID) 
	{
		System.out.println("Name :" +name );
		System.out.println("Address :" +address );
		System.out.println("ContactNumber :" +contactNumber );
		System.out.println("Email :" +email );
		System.out.println("ProofType :" +proofType );
		System.out.println("ProofID :" +proofID );
		System.out.println("Thank you for registering.Your id is 1...");
		
	}	
	
}


	
