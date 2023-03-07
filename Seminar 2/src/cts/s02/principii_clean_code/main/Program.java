package cts.s02.principii_clean_code.main;

import java.io.FileNotFoundException;
import java.util.List;

import cts.s02.principii_clean_code.clase.*;
import cts.s02.principii_clean_code.clase.readers.AplicantReader;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;

		try {
			AplicantReader aplicantReader=new AngajatReader();
			listaAngajati = aplicantReader.readAplicants("angajati.txt");
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
