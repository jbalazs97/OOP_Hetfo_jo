package harmadik;

import java.awt.Color;

import masik.Pont;
import sajat.ISzinezheto;

public class SzinesPont extends Pont implements ISzinezheto {

	private Color szin;
	
	
	

	
	
	public SzinesPont(Color szin){
		super(0,0);
		this.szin = szin;
	}
	
	
	

	@Override
	public Color getSzin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSzin(Color szin) {
		// TODO Auto-generated method stub

	}


	@Override
	public String toString() {
		return "SzinesPont [getSzin()=" + getSzin() + ", toString()=" + super.toString() + "]";
	}
	
	

}
