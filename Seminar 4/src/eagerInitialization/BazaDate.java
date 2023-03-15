package eagerInitialization;

public class BazaDate {

    private int dimensiune;
    private String denumire;
    private static BazaDate instanta=new BazaDate(10,"OOP");

    public void setDimensiune(int dimensiune) {
        this.dimensiune = dimensiune;
    }

    private BazaDate(int dimensiune, String denumire) {
        this.dimensiune = dimensiune;
        this.denumire = denumire;
    }

    public static BazaDate getInstanta()
    {
        return instanta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BazaDate{");
        sb.append("dimensiune=").append(dimensiune);
        sb.append(", denumire='").append(denumire).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
