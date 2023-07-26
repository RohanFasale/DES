
public class hasA_new {
	public static void main(String[] args) {
		
		Human th = new Human();
	   	 th.breathing();
	   	 th.thinking();
	   	 th.drinkcococola();
	   	 th.smoking();
	}

}

class Heart{
	void pumping() {
	System.out.println("Heart is Pummping.....");
	
}
}	
class Brain {
	void analysing() {
		System.out.println("Brain is Analysing...");
	}
}
class Mamals{
	
}
class Human extends Mamals{
	private Heart mh = new Heart();
	private Brain b = new Brain();
	void breathing() {
		System.out.println("Human is Breathing");
		mh.pumping();
	}
	void thinking() {
		System.out.println("Human is thinking....");
	}
	void drinkcococola() {
		System.out.println("Drinking cococola...");
	}
	void smoking() {
		System.out.println("Smoking....");
	}
}
