package composite;

import java.util.ArrayList;
import java.util.List;

public class Filiala implements UnitateBancara{

    private String denumire;

    private int nrAng;

    public Filiala(String denumire, int nrAng) {
        this.denumire = denumire;
        this.nrAng = nrAng;
    }

    @Override
    public void adaugaUnitate(UnitateBancara unitateBancara) {
        throw new RuntimeException();
    }

    @Override
    public void stergeUnitate(UnitateBancara unitateBancara) {
        throw new RuntimeException();
    }

    @Override
    public UnitateBancara getUnitate(int index) {
        throw new RuntimeException();
    }

    @Override
    public void printeazaDescriere() {
        System.out.println("Filiala "+denumire+"are "+nrAng);
    }
}
