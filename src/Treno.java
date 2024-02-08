/**
 * 
 */
/*
 * WEQFUBY
 */
public class Treno {
	private String nome;
	private int pos;
	private Vagone[] Vagoni;
	/**
	 * 
	 * @param nome
	 * @param numM
	 */
	public Treno(String nome, int numM) {
		this.nome = nome;
		Vagoni=new Vagone[numM];
		}
	/**
	 * 
	 * @param v
	 * @return
	 */
	public boolean addVagone(Vagone v) {
		if (pos<Vagoni.length) {
			Vagoni[pos++]=v;
			return true;
		}
		return false;
	}
	/**
	 * 
	 * @param nu
	 * @return
	 */
	public boolean elimina(int nu) {
		for (int i=0;i<pos;i++) {
			if (Vagoni[i].numVagone==nu) {
				for (int j=0;j<pos;j++)
					Vagoni[j]=Vagoni[j+1];
				pos--;
				return true;
			}
		}
		return false;
	}
	/**
	 * 
	 * @return
	 */
	public String visTreno() {
		String s="Vagoni treno";
		for(int i=0;i<pos;i++)
			s+=Vagoni[i].toString();
		return s;
		}
	/**
	 * 
	 * @param n
	 * @return
	 */
	public String visVagone(int n) {
		String s="";
		if (n==1) {
			for (int i=0;i<pos;i++) {
				if (Vagoni[i].getClass()==Passeggeri.class)
					s+=Vagoni[i].toString();
			}
			return s;
		} else {
			for (int i=0;i<pos;i++) {
				if (Vagoni[i].getClass()==Merci.class)
					s+=Vagoni[i].toString();
			}
			return s;
		}
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Treno t1=new Treno("diego",11);
	}

}
