public class Secretariat {
    private int numarBirou;
    private int numarAngajati;

    public static Secretariat instanta=null;

    private Secretariat(int numarBirou, int numarAngajati) {
        this.numarBirou = numarBirou;
        this.numarAngajati = numarAngajati;
    }

    public int getNumarBirou() {
        return numarBirou;
    }

    public void setNumarBirou(int numarBirou) {
        this.numarBirou = numarBirou;
    }

    public int getNumarAngajati() {
        return numarAngajati;
    }

    public void setNumarAngajati(int numarAngajati) {
        this.numarAngajati = numarAngajati;
    }

    public static Secretariat getInstanta() {
        return instanta;
    }

    public static void setInstanta(Secretariat instanta) {
        Secretariat.instanta = instanta;
    }

    public synchronized static Secretariat getInstance(int numarBirou,int numarAngajati)
    {
        if(Secretariat.instanta==null)
        {
            Secretariat.instanta=new Secretariat(numarBirou,numarAngajati);
        }
        return Secretariat.instanta;
    }

}
