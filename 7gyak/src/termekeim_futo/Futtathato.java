package termekeim_futo;

import termekeim.*;

public class Futtathato {

	public static void main(String[] args) {
		
		Aru aru_objektum = new Aru("aru", 20, 27);
		Kenyer kenyer_objektum = new Kenyer("kenyer", 100, 15, 0.75);
		
		System.out.println("A termek adatok:");
		System.out.println(aru_objektum);
		System.out.println(kenyer_objektum);
		System.out.println();		
		
		int melyik_dragabb = aru_objektum.nagyobb_e(kenyer_objektum);
         
		if (melyik_dragabb > 0) {
			System.out.println("aru a dragabb\n" + aru_objektum);
		}
		else if (melyik_dragabb < 0) {
			System.out.println("kenyer a dragabb\n" + kenyer_objektum);
		}
		else {
			System.out.println("egyforma a brutto aruk\n");
		}
	}

}
