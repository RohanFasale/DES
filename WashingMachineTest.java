
public class WashingMachineTest {
	public static void main(String[] args) {
		
		WashingPowder washPowder = new WashingPowder(100,"Nirma", "Front Load", true, 10.0f);
		Electricity ec = new Electricity(4,"ABC");
		Cloth cloth = new Cloth(5,60, 2);
		
		WashingMachine wm = new WashingMachine();
		Laundry l = wm.wash(washPowder, ec, cloth);
		System.out.println("wash powder : "+washPowder); //toString is invoked
		System.out.println("Cloth: "+cloth);
		System.out.println("elec: "+ec);
		System.out.println("Laundry: "+l);
		
	}
}

class Machine {
	
}
class WashingMachine extends Machine { //isA
	
	

	
		Laundry wash(WashingPowder washPowder, Electricity elect, Cloth cloth) {
			Laundry l = new Laundry();
			l.setElectricityUsed( cloth.getunitpercl());
		    
		    l.setTimeRequired(cloth.gettimepercl()*1);
		    l.setTotalCost(l.getElectricityUsed()*elect.getCostPerUnit()*cloth.getcost());
		 
		   
		   
			return l;
		}
}

class Laundry {

	private float timeRequired;
	private float totalCost ;// cloth.length * price per cloth
	private float electricityUsed;
	
	public Laundry() {
	}
	public Laundry( float timeRequired, float totalCost, float waterUsed, float electricityUsed) {
		super();
	
		this.timeRequired = timeRequired;
		this.totalCost = totalCost;
		this.electricityUsed = electricityUsed;
		
	}

	

	public float getTimeRequired() {
		return timeRequired;
	}

	public void setTimeRequired(float timeRequired) {
		this.timeRequired = timeRequired;
	}

	public float getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}


	public float getElectricityUsed() {
		return electricityUsed;
	}

	public void setElectricityUsed(float electricityUsed) {
		this.electricityUsed = electricityUsed;
	}
	@Override
	public String toString() {
		return "Laundry [timeRequired=" + timeRequired + ", totalCost=" + totalCost + ", electricityUsed="
				+ electricityUsed + "]";
	}
	
	
	
	
}



class WashingPowder extends Powder { // isA

	private int quantity;
	private String brand;
	private String type;
	private boolean scented;
	private float price;
	
	public WashingPowder(int quantity, String brand, String type, boolean scented, float price) {
		super();
		this.quantity = quantity;
		this.brand = brand;
		this.type = type;
		this.scented = scented;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "WashingPowder [quantity=" + quantity + ", brand=" + brand + ", type=" + type + ", scented=" + scented
				+ ", price=" + price + "]";
	}
	/*public String toString() {
		String str = (scented) ? "Scented" :"Not Scented";
		return str+ " "+brand+" Washing Powder of "+type+ " type quantity used "+quantity+ " grams ";
	}*/

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isScented() {
		return scented;
	}

	public void setScented(boolean scented) {
		this.scented = scented;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
}



class Electricity {
	
	private int costPerUnit;
	
	private String supplier;
	public Electricity(int costPerUnit, String supplier) {
		super();
		
		this.costPerUnit = costPerUnit;
		
		this.supplier = supplier;
	}
	
	
	
	
	public int getCostPerUnit() {
		return costPerUnit;
	}
	public void setCostPerUnit(int costPerUnit) {
		this.costPerUnit = costPerUnit;
	}
	
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}




	@Override
	public String toString() {
		return "Electricity [costPerUnit=" + costPerUnit + ", supplier=" + supplier + "]";
	}
	
	
	
}

class Cloth {

	private float cost;
	
	private int timepercl ;
	private int unitpercl;
	
	public Cloth(float cost,int timepercl,int unitpercl) {
		super();
		
		this.cost = cost;
		this.timepercl= timepercl;
		this.unitpercl=unitpercl;
		
	}
	
	
	public int getcost() {
		return (int) cost;
	}
	public void setcost(int cost) {
		this.cost = cost;
	}
	public int gettimepercl() {
		return timepercl;
	}
	public void settimepercl(int timepercl) {
		this.timepercl = timepercl;
	}
	public int getunitpercl() {
		return unitpercl;
	}
	public void setunitpercl(int unitpercl) {
		this.unitpercl = unitpercl;
	}


	@Override
	public String toString() {
		return "Cloth [cost=" + cost + ", timepercl=" + timepercl + ", unitpercl=" + unitpercl + "]";
	}
	
	

	
}