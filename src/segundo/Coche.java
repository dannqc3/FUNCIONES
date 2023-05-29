package segundo;

public class Coche {	
	private int puertas;
	
	Coche(){		//Constructor
		puertas = 0;
	}
	
	public void incrementarPuertas() {
		puertas++;
	}
	
	public int getPuertas() {
		return puertas;
	}
}
