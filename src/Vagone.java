/**
 * 
 */
public class Vagone {
	int numVagone;
	float pesoVuoto;
	/*
	 * 
	 */
	public Vagone(int nv, float pv) {
		numVagone=nv;
		pesoVuoto=pv;
	}
	/**
	 * 
	 */
	public String toString() {
		return "Vagone [numero vagone=" + numVagone + ", peso a vuoto=" + pesoVuoto + "]";
	}
/**
 * 
 */
	public static void main(String[] args) {
		Vagone v1=new Vagone(5,3000);
		System.out.println(v1);
	}

}
