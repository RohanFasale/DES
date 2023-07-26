

public class InstrumentTest {
	public static void main(String[] args) {
		

		
		Instrument sbmi1 = new Violin();
		sbmi1.use();
		((MusicalInstrument)sbmi1).play();
		(( StringBasedMusicalInstrument)sbmi1).tuneStrings();
		((Violin)sbmi1).bow();
        System.out.println("=========================");
                 
        Instrument sbmi2 = new Guitar();
		sbmi2.use();
		((MusicalInstrument)sbmi2).play();
		(( StringBasedMusicalInstrument)sbmi2).tuneStrings();
		((Guitar)sbmi2).pluck();
        System.out.println("=========================");
                
        Instrument sbmi3 = new ElectronicGuitar();
		sbmi3.use();
		((MusicalInstrument)sbmi3).play();
		(( StringBasedMusicalInstrument)sbmi3).tuneStrings();
		((ElectronicGuitar)sbmi3).preset();
        System.out.println("=========================");
                
        Instrument sbmi4 = new Cello();
		sbmi4.use();
		((MusicalInstrument)sbmi4).play();
		(( StringBasedMusicalInstrument)sbmi4).tuneStrings();
		((Cello)sbmi4).longBowing();
        System.out.println("=========================");
        
        Instrument sbmi5 = new Flute();
		sbmi5.use();
		((MusicalInstrument)sbmi5).play();
		(( AirBasedMusicalInstrument)sbmi5).blowAir();
		((Flute)sbmi5).fluteart();
        System.out.println("=========================");
        
        Instrument sbmi6 = new Harmonium();
		sbmi6.use();
		((MusicalInstrument)sbmi6).play();
		(( AirBasedMusicalInstrument)sbmi6).blowAir();
		((Harmonium)sbmi6).harmoniumart();
        System.out.println("=========================");
        
        Instrument sbmi7 = new Tabla();
		sbmi7.use();
		((MusicalInstrument)sbmi7).play();
		(( DrumBasedMusicalInstrument)sbmi7).tuneSurface();
		((Tabla)sbmi7).Tablaart();
        System.out.println("=========================");
        
        Instrument sbmi8 = new Dhol();
		sbmi8.use();
		((MusicalInstrument)sbmi8).play();
		(( DrumBasedMusicalInstrument)sbmi8).tuneSurface();
		((Dhol)sbmi8).Dholart();
        System.out.println("=========================");
        
        Instrument sbmi9 = new SurgicalCutter();
		sbmi9.use();
		((MedicalInstrument)sbmi9).operate();
		((SurgicalInstrument)sbmi9).sterile();
        System.out.println("=========================");
        
        Instrument sbmi10 = new SurgicalNeedle();
		sbmi10.use();
		((MedicalInstrument)sbmi10).operate();
		((SurgicalInstrument)sbmi10).sterile();
        System.out.println("=========================");
        
        Instrument sbmi11 = new Glucometer();
		sbmi11.use();
		((MedicalInstrument)sbmi11).operate();
		((PathologicalInstrument)sbmi11).reader();
        System.out.println("=========================");
        
        
        
        Instrument sbmi12 = new ECGMachine();
		sbmi12.use();
		((MedicalInstrument)sbmi12).operate();
		((PathologicalInstrument)sbmi12).reader();
        System.out.println("=========================");
        

      
	}
}

interface Instrument
{
	void use(); //by default method is public and abstract
}
abstract class MusicalInstrument implements Instrument
{
	abstract void play();
}
abstract class StringBasedMusicalInstrument extends MusicalInstrument
{
	abstract void tuneStrings();
}
class Guitar extends StringBasedMusicalInstrument
{
	public void use() {
		System.out.println("Using Guitar...");
	}
	void play() {
		System.out.println("Playing Guitar...");

	}
	void tuneStrings() {
		System.out.println("Tuning Strings of Guitar...");

	}
	void pluck() {
		System.out.println("Plucking Strings of Guitar...");

	}
}
class ElectronicGuitar extends StringBasedMusicalInstrument
{
	public void use() {
		System.out.println("Using ElectronicGuitar...");
	}
	void play() {
		System.out.println("Playing ElectronicGuitar...");

	}
	void tuneStrings() {
		System.out.println("Tuning Strings of ElectronicGuitar...");

	}
	void preset() {
		System.out.println("Preset Electronic Guitar...");

	}
}


class Violin extends StringBasedMusicalInstrument
{
        
	public void use() {
		System.out.println("Using Violin...");
	}
      
	void play() {
		System.out.println("Playing Violin...");

	}
       
	void tuneStrings() {
		System.out.println("Tuning Strings of Violin...");

	}
	void bow() {
		System.out.println("Bowing Strings of Violin...");

	}
}

class Cello extends StringBasedMusicalInstrument
{
	public void use() {
		System.out.println("Using Cello...");
	}
	void play() {
		System.out.println("Playing Cello...");

	}
	void tuneStrings() {
		System.out.println("Tuning Strings of Cello...");

	}
	void longBowing() {
		System.out.println("Long Bowing Strings of Cello...");

	}
}

abstract class AirBasedMusicalInstrument extends MusicalInstrument
{
	abstract void blowAir();
}

class Flute extends AirBasedMusicalInstrument{
    public void use(){
        System.out.println("Using Flute....");
    }
    void play(){
        System.out.println("Playing Flute....");
    }
    void blowAir(){
        System.out.println("Flute is blowAir");
    }
    void fluteart(){
        System.out.println("Flute Art");
    }
}

class Harmonium extends AirBasedMusicalInstrument{
    public void use(){
        System.out.println("Using Harmonium ....");
    }
    void play(){
        System.out.println("Playing Harmonium ....");
    }
    void blowAir(){
        System.out.println("Harmonium  is blowAir");
    }
    void harmoniumart(){
        System.out.println("Harmonium Art");
    }
}



abstract class DrumBasedMusicalInstrument extends MusicalInstrument
{
	abstract void tuneSurface();
}

class Tabla extends DrumBasedMusicalInstrument{
    public void use(){
        System.out.println("Using Tabla....");
    }
    void play(){
        System.out.println("Playing Tabla....");
    }
    void tuneSurface(){
        System.out.println("Tabla is Tune Surface");
    }
    void Tablaart(){
        System.out.println("Tabla Art");
    }
}

class Dhol extends DrumBasedMusicalInstrument{
    public void use(){
        System.out.println("Using Dhol....");
    }
    void play(){
        System.out.println("Playing Dhol....");
    }
    void tuneSurface(){
        System.out.println("Tabla is Tune Surface");
    }
    void Dholart(){
        System.out.println("Dhol Art");
    }
}


abstract class MedicalInstrument implements Instrument
{
	abstract void operate();
}
abstract class SurgicalInstrument extends MedicalInstrument
{
	abstract void sterile();
}

class SurgicalCutter extends SurgicalInstrument{
    public void use(){
        System.out.println("Using Surgical Cutter");
    }
    void operate(){
        System.out.println("Operating Surgical Cutter");
    }
    void sterile(){
     System.out.println("sterile Surgical Cutter");   
    }
}
class SurgicalNeedle extends SurgicalInstrument{
    public void use(){
        System.out.println("Using SurgicalNeedle");
    }
    void operate(){
        System.out.println("Operating SurgicalNeedle");
    }
    void sterile(){
        System.out.println("sterile SurgicalNeedle");
    }
}

abstract class PathologicalInstrument extends MedicalInstrument
{
	abstract void reader();
}
class Glucometer extends PathologicalInstrument{
    public void use(){
        System.out.println("Using Glucometer");
    }
    void operate(){
        System.out.println("Operating Glucometer");
    }
    void reader(){
        System.out.println("Reading Glucometer");
    }
}
class ECGMachine extends PathologicalInstrument{
    public void use(){
        System.out.println("Using ECGMachine");
    }
    void operate(){
        System.out.println("Operating ECGMachine");
    }
    void reader(){
        System.out.println("Reading ECGMachine");
    }
}
