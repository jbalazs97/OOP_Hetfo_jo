package proba;

import java.awt.Color;
import harmadik.SzinesPont;
import sajat.ISzinezheto;

public class Teszt {

	public static void main(String[] args) {
		ISzinezheto szinespont = new SzinesPont(Color.BLUE);
		
		
		System.out.println(szinespont);
		szinespont.setSzin(Color.GREEN);
		System.out.println(szinespont);
		
		
		
	}
}
