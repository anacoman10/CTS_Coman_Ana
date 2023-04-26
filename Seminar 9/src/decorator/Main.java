package decorator;

public class Main {
    public static void main(String[] args) {
        FurnizareRezultat furnizareRezultat=new RezultatPeHartie();
        furnizareRezultat.printeazaRezultat("Raceala");

        DecoratorAbstract rezultatOnline=new RezultatOnline(furnizareRezultat);
        rezultatOnline.afisareOnline("Raceala");
    }
}
