package Polymorphism;
import java.util.Scanner;
public class Butter {

	public static void main(String[] args) {
		

		Scanner s = new Scanner(System.in);
	    Calories x = new Calories();
	    System.out.println("1.Bread only\n2.Bread+Jam\n3.Bread+Jam+Butter");
	    System.out.println("Enter the choice");
	    int c = s.nextInt();
	    int bread,jam,butter;
	    switch(c)
	    {
	      case 1:
	        System.out.println("Enter the number of slice of bread");
	        bread = s.nextInt();
	        x.calculateCalories(bread);
	        break;
	      case 2:
	        System.out.println("Enter the number of Slice of bread");
	        bread = s.nextInt();
	        System.out.println("Enter the number of teaspoon of Jam");
	        jam = s.nextInt();
	        x.calculateCalories(bread,jam);
	        break;
	      case 3:
	        System.out.println("Enter the number of Slice of bread");
	        bread = s.nextInt();
	        System.out.println("Enter the number of teaspoon of Jam");
	        jam = s.nextInt();
	        System.out.println("Enter the number of teaspoon of Butter");
	        butter = s.nextInt();
	        x.calculateCalories(bread,butter,jam);
	    break;
	      default:
	         System.out.println("Invaild option");
	        break;
	    }
	  }
	}
	  class Calories{
	    double a=0;
	    double kcal=4.1868;
	    double energy;
	    public void calculateCalories(int bread)
	    {
	      a=74*bread;
	      energy=kcal*a;
	      calculateEnergy(a,energy);
	    
	    
	    }
	    public void calculateCalories(int bread,int jam)
	    {
	      a=74*bread+102*jam;
	      energy=kcal*a;
	      calculateEnergy(a,energy);
	    }
	    public void calculateCalories(int bread,int jam,int butter)
	    {
	      a=74*bread+102*jam+26*butter;
	      energy=kcal*a;
	     calculateEnergy(a,energy);
	  
	  }
	    public void calculateEnergy(double a,double energy)
	    {
	      System.out.printf("%.3f kj of energy generated from "+a+" calories",energy);
	}
	  }
