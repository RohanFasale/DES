
public class ClassExtensionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Doctor d = new Surgeon();
		Surgeon s = new HeartSurgeon();
		HeartSurgeon hs = new HeartSurgeon();
	s.diagnose();
	s.cut();
	s.prescribe();
	s.charge();
	
		if(d instanceof Surgeon) {
		//System.out.println("It's Doctor Object");
		}
		else {
			System.out.println("It is not Doctor Object");
		}
		
		if(s instanceof Surgeon) {
			//System.out.println("It's Surgeon Object");
			}
			else {
				System.out.println("It is not Surgeon Object");
			}
		
		if(hs instanceof Surgeon) {
			//System.out.println("It's HeartSurgeon Object");
			}
			else {
				System.out.println("It is not HeartSurgeon Object");
			}
		
	}

}
class Doctor{
	void diagnose() {
		System.out.println("yes doctor");
	}
	void prescribe() {
		System.out.println("Doctor: is prescribing");
	}
	void charge() {
		System.out.println("Doctor: is charging");
	}
}
class Surgeon extends Doctor{
	void diagnose() {
		System.out.println("yes Surgeon");
	}
	void prescribe() {
		System.out.println("Surgeon: is prescribing...expensive pills....");
	}
	void charge() {
		System.out.println("Surgeon: is charging...1000/- ...");
	}
	void cut() {
		System.out.println("Surgeon: is cutting......");
	}
	void stitch() {
		System.out.println("Surgeon: is stitching......");
	}

}
class HeartSurgeon extends Surgeon{
	void diagnose() {
		System.out.println("yes HeartSurgeon");
	}
	void prescribe() {
		System.out.println("HeartSurgeon: is prescribing...expensive pills....plus yoga..plus exercises");
	}
	void charge() {
		System.out.println("HeartSurgeon: is charging...3000/- ...");
	}

}