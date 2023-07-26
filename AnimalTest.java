

public class AnimalTest {
	public static void main(String[] args) {
		

		
		Animal a1 = new Tiger();
		a1.animal();
		((Mammals)a1).mammals();
		((Carnivore)a1).eatMeal();
		((Tiger)a1).tiger();
        System.out.println("=========================");
        
        Animal a2 = new Lion();
		a2.animal();
		((Mammals)a2).mammals();
		((Carnivore)a2).eatMeal();
		((Lion)a2).lion();
        System.out.println("=========================");
            
        Animal a3 = new Rat();
        a3.animal();
        ((Mammals)a3).mammals();
		((Rodents)a3).rodent();
		((Rat)a3).rat();
		System.out.println("=========================");
		
		Animal a4 = new Squirrel();
        a4.animal();
        ((Mammals)a4).mammals();
		((Rodents)a4).rodent();
		((Squirrel)a4).squirrel();
        System.out.println("=========================");
                
        

      
	}
}

interface Animal
{
	void animal(); //by default method is public and abstract
}

abstract class Mammals implements Animal
{
	abstract void mammals();
}

abstract class Carnivore extends Mammals
{
	abstract void eatMeal();
}
class Tiger extends Carnivore
{
	public void animal(){
	    System.out.println("It is Animal...");
	}
	void mammals(){
	    System.out.println("It is Mammals.....");
	}
	void eatMeal(){
	    System.out.println("He eat Meal....");
	}
	void tiger(){
	 System.out.println("Tiger");   
	}
}
class Lion extends Carnivore
{
	public void animal(){
	    System.out.println("It is Animal...");
	}
	void mammals(){
	    System.out.println("It is Mammals.....");
	}
	void eatMeal(){
	    System.out.println("He eat Meal....");
	}
	void lion(){
	 System.out.println("Lion");   
	}
}



abstract class Rodents extends Mammals
{
	abstract void rodent();
}
class Rat extends Rodents
{
	public void animal(){
	    System.out.println("It is Animal...");
	}
	void mammals(){
	    System.out.println("It is Mammals.....");
	}
	void rodent(){
	    System.out.println("It is Rodent");
	}
	void rat(){
	 System.out.println("It is Rat");   
	}
}

class Squirrel extends Rodents
{
	public void animal(){
	    System.out.println("It is Animal...");
	}
	void mammals(){
	    System.out.println("It is Mammals.....");
	}
	void rodent(){
	    System.out.println("It is Rodent");
	}
	void squirrel(){
	 System.out.println(" It is Squirrel");   
	}
}


abstract class Primate extends Mammals
{
	abstract void primate();
}
