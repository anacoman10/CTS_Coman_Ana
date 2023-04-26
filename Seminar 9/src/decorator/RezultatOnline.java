package decorator;

public class RezultatOnline extends DecoratorAbstract{

    public RezultatOnline(FurnizareRezultat rezultatPeHartie) {
        super(rezultatPeHartie);
    }

    @Override
    public void afisareOnline(String diagnostic) {
        System.out.println("Site: "+diagnostic);
    }
}
