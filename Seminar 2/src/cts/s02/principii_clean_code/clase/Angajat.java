package cts.s02.principii_clean_code.clase;

import java.util.Arrays;

public class Angajat extends Aplicant{
	private String ocupatie;
	private int salariu;

	public Angajat(String nume, String prenume, int varsta, int punctaj, int numarProiecte, String[] denumireProiecte,int salariu,String ocupatie) {
		super(nume,prenume,varsta,punctaj,numarProiecte,denumireProiecte);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}

	public String getOcupatie() {
		return ocupatie;
	}

	public int getSalariu() {
		return salariu;
	}

	@Override
	public String toString() {
		return "Angajat: Nume=" + nume + ", Prenume=" + prenume
				+ ", Varsta=" + varsta + ", Punctaj=" + punctaj + ", Nr_proiecte=" + numarProiecte + ", DenumireProiect="
				+ Arrays.toString(denumireProiect) + "Ocupatie=" + ocupatie + ", salariu=" + salariu;
	}

	public int finantare() {

		int suma=10;
		System.out.println("Angajatul "+getNume()+" "+getPrenume()+" primeste"+suma+" Euro/zi in proiect.");
		return suma;
	}
	
}
