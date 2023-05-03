package composite;

import java.util.ArrayList;
import java.util.List;
public class Sucursala implements UnitateBancara{

    private String nume;
    private int nrAng;

    private List<UnitateBancara>lista;

    public Sucursala(String nume, int nrAng) {
        this.nume = nume;
        this.nrAng = nrAng;
        this.lista = new ArrayList<>();
    }

    @Override
    public void adaugaUnitate(UnitateBancara unitateBancara) {
        this.lista.add(unitateBancara);
    }

    @Override
    public void stergeUnitate(UnitateBancara unitateBancara) {
        lista.remove(unitateBancara);
    }

    @Override
    public UnitateBancara getUnitate(int index) {
        return lista.get(index);
    }

    @Override
    public void printeazaDescriere() {
        System.out.println("sucursala "+nume+"are "+nrAng);

    }
}
