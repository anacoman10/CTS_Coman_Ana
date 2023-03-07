package cts.s02.principii_clean_code.clase;

//2 repo - unul local si unul central

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int numarProiecte;
	protected String[] denumireProiect;

	public Aplicant(String nume, String prenume, int varsta, int punctaj, int numarProiecte, String[] denumireProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.numarProiecte = numarProiecte;
		this.denumireProiect = denumireProiect;
	}

	public String getNume() {
		return nume;
	}

	public String getPrenume() {
		return prenume;
	}
	public int getVarsta() {
		return varsta;
	}
	public int getPunctaj() {
		return punctaj;
	}

	public int getNumarProiecte() {
		return numarProiecte;
	}

	public void statut(){
		if(punctaj>80)
		{
			System.out.println("Aplicantul "+nume+" "+prenume+" a fost acceptat.");
		}
		else
			System.out.println("Aplicantul "+nume+" "+prenume+" nu a fost acceptat.");
		}


}
