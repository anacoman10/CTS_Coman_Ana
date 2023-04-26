package decorator;

public abstract class DecoratorAbstract implements FurnizareRezultat {
    private FurnizareRezultat rezultatPeHartie;

    public DecoratorAbstract(FurnizareRezultat furnizareRezultat) {
        this.rezultatPeHartie = rezultatPeHartie;
    }

    @Override
    public void printeazaRezultat(String diagnostic) {
        rezultatPeHartie.printeazaRezultat(diagnostic);

    }

    public abstract void afisareOnline(String diagnostic);


}
