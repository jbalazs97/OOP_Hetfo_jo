
public class gyak_1_1 {

	public static void main(String[] args) {
		//Wallis-formula
		
		double pi= 1;
		int darab = 1000;
		
		for (int i = 1; i <=darab; i++) {
			pi *=2.0 * i / (2 * i - 1);
			pi *=2.0 * i / (2 * i + 1);

		}
		System.out.println("Wallis-Formula");
		System.out.println("pi/2 erteke: " + pi);
		System.out.println("pi :" +  pi*2);
		System.out.println("A : " + szam + "faktorialisa:" +fakt);

		// Leibniz-fele sor
		darab *=4;
		pi=0;
		int elojel=1;
			
			for (int i = 0; i <= darab; i+=2) {
				pi += elojel * 1.0;
				elojel*= -1;
		
		int fakt=1;
		int szam =5;
			for (int j = 1; j < szam; j++) {
				fakt=fakt*i;
				
			}
	}
			

}
}