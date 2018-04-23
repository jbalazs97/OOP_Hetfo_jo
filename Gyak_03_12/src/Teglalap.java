public class Teglalap {

    private int a_oldal;
    private int b_oldal;

    public Teglalap(int a_oldal, int b_oldal) {
        this.a_oldal = a_oldal;
        this.b_oldal = b_oldal;

    }
    public Teglalap(int oldalhossz) {
        this.a_oldal = this.b_oldal = oldalhossz;
    }

    public int Terulet (){
        return a_oldal * b_oldal;
    }

    @Override
    public String toString() {
        return "a oldal= " + a_oldal + ", b oldal= " + b_oldal + " terulet: " + Terulet();
    }

    public void setOldalak(int a_oldal , int b_oldal){
        this.a_oldal = a_oldal;
        this.b_oldal = b_oldal;
    }

    public void setOldalak(int oldalhossz){
        this.a_oldal = this.b_oldal = oldalhossz;
    }

    public boolean nagyobbe (Teglalap ujteglalap){
        return Terulet() > ujteglalap.Terulet();
    }

    public boolean egyezikE(Teglalap ujteglalap) {
        return a_oldal == ujteglalap.a_oldal
                && b_oldal== ujteglalap.b_oldal;
    }
}