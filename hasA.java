public class hasA {
     public static void main(String[] args) {
    	 Human th = new Human();
    	 th.breathing();
    	 System.out.println("=======================");
    	 th.thinking();
    	 System.out.println("=======================");
    	 th.drinkLemonJuice();
    	 System.out.println("=======================");
 		 th.doPranayama();	
    	 
    	 
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
class Kidney {
	void filterBlood() {
		System.out.println("Filtering the blood....");
	}
}
class Lung {
	void oxegenateBlood() {
		System.out.println("Oxegenating blood......");
	}
}
class Mamals{
	
}
class Human extends Mamals{
	private Heart mh = new Heart();
	private Brain b = new Brain();
	private Kidney rk = new Kidney();
	private Kidney lk = new Kidney();
	private Lung rl = new Lung();
	private Lung ll = new Lung();
	
	void breathing() {
		System.out.println("Human is Breathing");
		mh.pumping();
	}
	void thinking() {
		System.out.println("Human is thinking....");
		b.analysing();
	}
	void drinkLemonJuice() {
		System.out.println("Drinking lemon juice...");
		rk.filterBlood();
		lk.filterBlood();
	}
	void doPranayama() {
		System.out.println("Doing Pranayama....");
		rl.oxegenateBlood();
		ll.oxegenateBlood();
	}
}
