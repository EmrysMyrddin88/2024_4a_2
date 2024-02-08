
public class Passeggeri extends Vagone {
String classe;
int postiDisponibili, postiOccupati;
public Passeggeri(int nv, float pv, String classe, int postiDisponibili, int postiOccupati) {
	super(nv, pv);
	this.classe = classe;
	this.postiDisponibili = postiDisponibili;
	this.postiOccupati = postiOccupati;
}
@Override
public String toString() {
	String s=super.toString();
	s+= "Passeggeri [classe=" + classe + ", postiDisponibili=" + postiDisponibili + ", postiOccupati="
			+ postiOccupati + "]";
	return s;
}
public static void main(String[] args) {
	Passeggeri p1=new Passeggeri(4,2000,"diego",10,7);
	Vagone v1=new Vagone(3,3000);
	System.out.println(v1);
	System.out.println("--------");
	System.out.println(p1);
}
}
