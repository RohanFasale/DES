import java.util.Scanner;

public class IterationTest {
	public static void main(String[] args) {
	
		
		Demo demoRef = new Demo();
		demoRef.demo();

	}
}




class Demo
{
	void demo() {
		
		System.out.println("Which Electricity Consumer you are ? ");
		Scanner scanner = new Scanner(System.in);
		
		String theUser = scanner.next();
		
		Electricity electricity = Mahavitaran.getElectricity(theUser);
		SavingsAccount savObj = new SavingsAccount();
		Kw kw= electricity.doTrick(savObj);
		kw.show();
		
	}
}

class Mahavitaran {
	public static Electricity getElectricity(String hint) {
		Electricity electricity = null;
		if(hint.equalsIgnoreCase("Enterprise")) {
			electricity = new EnterpriseUser();
		}
		else if(hint.equalsIgnoreCase("Household")) {
			electricity = new HouseholdUser();
		} 
		return electricity;
	}
}

interface Account {
	void withdraw(float  amt);
	void deposit(float amt);
}
class SavingsAccount implements Account {
	public void withdraw(float amt) {
		System.out.println("withdrawing..."+amt);
	}
	public void deposit(float amt) {
		System.out.println("depositing...."+amt);
	}
}

interface Electricity
{
	Kw doTrick(Account acc);	
}

class HouseholdUser implements Electricity
{
	public Kw doTrick(Account accRef) {
		System.out.println("Water heater,Lighting,Refrigerator,Washer,dryer,Electric oven,Dishwasher,TV and cable box:");
		Kw kw = new Household();
		accRef.deposit(5000);
		return kw;
	}
}

class EnterpriseUser implements Electricity
{
	public Kw doTrick(Account accRef) {
		System.out.println("operating industrial motors and machinery, lights, computers and office equipment, and equipment for facility heating, cooling, and ventilation.");
		Kw kw= new Enterprise();
		accRef.deposit(6000);
		return kw;
	}
}


interface Kw
{
	void show();
}
class Household implements Kw
{
	public void show() {
		System.out.println("Go Green");
	}
}

class Enterprise implements Kw
{
	public void show() {
		System.out.println("Showing hats  and parrot...in a magical way....");
	}
}





