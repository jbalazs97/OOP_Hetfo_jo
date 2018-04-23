
public class vmi {
	public static void main(String[] args) {
		//Leibniz-formula
		
		int darab =50;
		double pi=0;
		double elojel=1;
			
			for (int i = 0; i < darab; i++) {
				if(i % 2 == 0){
					pi=pi+(1/elojel);
					
				}
				else{
					if(i % 2 == 0){
						pi=pi-(1/elojel);
				}
			}
		elojel=elojel+2;
		pi=pi*4;
		System.out.println(pi);
		
	}

}

}
