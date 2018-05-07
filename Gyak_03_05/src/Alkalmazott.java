
public class Alkalmazott {
	private String nev;
	private long fizetes;
	
	public void fizetestNovel(long ertek) {
		fizetes += ertek;
	}

	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public long getFizetes() {
		return fizetes;
	}

	public void setFizetes(long fizetes) {
		this.fizetes = fizetes;
	}

	@Override
	public String toString() {
		return "Alkalmazott neve: " + nev + ",\t fizetese: " + fizetes + " Ft";
	}
	
	public boolean fizetesIntervallummokKozott(long alsohatar, long felsohatar) {
		return fizetes >= alsohatar &&
				fizetes <= felsohatar;
	}
	
	public long fizetendoAdo() {
		return (long) (fizetes * 0.16);
		
	}
	
	public boolean nagyonnfizetesuMint(Alkalmazott masik) {
		return fizetes > masik.fizetes;
	}
	
	
	
}
