package sajat;

import java.io.*;
import java.util.*;

import kivetelek.NempozitivSzamException;

public class Proba4 {

	public static void main(String[] args)  {
		int elemekSzama= 5;
		int [] egeszTomb =new int[elemekSzama];
		
		//Scanner beolvasas = new Scanner(System.in);
		
		for (int i = 0; i < egeszTomb.length; i++) {
			egeszTomb[i]= egeszetBeolvas(i+1);
		}
		System.out.println("A tomb elemei: ");
		for (int i :egeszTomb) {
			System.out.println(i);
		}
		
		//beolvasas.close();
		
		
	}
	

	public static int egeszetBeolvas(int i) {
		int egeszSzam = 0;
		try {
			InputStreamReader bemenet = new InputStreamReader(System.in);
			BufferedReader beolvasas = new BufferedReader(bemenet);

			
		
			boolean rosszAdat = true;
			do {
				System.out.println("Kerem adja meg az " + (i) + ".egesz szamot");
				System.out.println("szam:");
				try {
					egeszSzam=Integer.parseInt(beolvasas.readLine());
					if (egeszSzam<=0) {
						//throw new IllegalArgumentException();
						throw new NempozitivSzamException("nem pozitiv szam");
					}
					rosszAdat =false;
					
		//belso try vege	
				}catch (NumberFormatException e) {
						System.out.println("rossz input");
					}
			catch (IllegalArgumentException e) {
							System.out.println("0 vagy negativ szam");	
			} catch (InputMismatchException e) {
				System.out.println("rossz input");
			} catch (NempozitivSzamException e) {
				System.out.println(e.getMessage());
			}
				 	
				
				
				
				
			} while (rosszAdat);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return(egeszSzam);
		
	
		
	}
		
		
	
	
	
	
	
	
	
}
