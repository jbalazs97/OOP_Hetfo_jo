
package sajat.elso;

public class Szam {

	private final static double tures = 0.001;
	private double szam;
	
	public Szam(int szam) {
		this.szam = szam;
	}

	public boolean turesenbelul(double be) {
	return Math.abs (be-szam) < tures;
		
		/*	if ((be-szam) <= tures || (szam-be <= tures)) {
			return(true);
		}else {
			return(false); */
		}

	public double getSzam() {
		return szam;
	}

	public void setSzam(double szam) {
		this.szam = szam;
	}
	
	
	
	}
	
