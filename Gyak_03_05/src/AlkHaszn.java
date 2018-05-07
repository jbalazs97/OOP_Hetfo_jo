import java.util.Random;

public class AlkHaszn {
	
	public static void main(String[] args){
		Alkalmazott alkalmazott = new Alkalmazott();
		
		//alkalmazott.nev = "Minta Janos";
		alkalmazott.setNev("Kis Jozsef ");
		//alkalmazott.fizetes= 10;
		alkalmazott.setFizetes(20);

		System.out.println(alkalmazott);
		alkalmazott.fizetestNovel (5);
		System.out.println(alkalmazott);
		
		System.out.println(alkalmazott.fizetesIntervallummokKozott(10, 50));
		
		System.out.println(alkalmazott.fizetendoAdo());
		
		Alkalmazott alkalmazott2 = new Alkalmazott();
		alkalmazott2.setNev("Kiss Klaudia");
		alkalmazott2.setFizetes(80);
		
		System.out.println(alkalmazott.nagyonnfizetesuMint(alkalmazott2));
		
		Alkalmazott[] alkalmazottak = new Alkalmazott[5];
		
		long max = 0;
		for (int i = 0; i < alkalmazottak.length; i++) {
			alkalmazottak[i] = new Alkalmazott();
			alkalmazottak[i].setNev("A");
			alkalmazottak[i].setFizetes( (long) (Math.random() * 50));
			System.out.println(alkalmazottak[i]);
			if ( alkalmazottak[i].getFizetes() > max) {
				max=alkalmazottak[i].getFizetes();
				}
		}
		
	}
	
}
