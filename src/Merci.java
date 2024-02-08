/**
 * 
 */
public class Merci extends Vagone {
	float volumec, pesoCarico;
	/**
	 * 
	 * @param nv
	 * @param pv
	 * @param volumec
	 * @param pesoCarico
	 */
	public Merci(int nv, float pv, float volumec, float pesoCarico) {
		super(nv, pv);
		this.volumec = volumec;
		this.pesoCarico = pesoCarico;
	}
/**
 * 
 */
	public String toString() {
		String s=super.toString();
		s+= "Merci [volume caricop=" + volumec + ", pesoCarico=" + pesoCarico + "]";
		return s;
	}
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		Merci m1=new Merci(4,2000,400,7000);
		Vagone v1=new Vagone(3,3000);
		System.out.println(v1);
		System.out.println("--------");
		System.out.println(m1);
	}

}
