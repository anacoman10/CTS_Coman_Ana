import eagerInitialization.BazaDate;
import singleton.classes.Secretariat;


public class Main {
    public static void main(String[] args) {
        Secretariat secretariat=Secretariat.getInstanta(1111,90);
        Secretariat secretariat1=Secretariat.getInstanta(1123,80);
        System.out.println(secretariat);
        System.out.println(secretariat1);

        BazaDate bazaDate=BazaDate.getInstanta();
        BazaDate bazaDate1=BazaDate.getInstanta();

        bazaDate.setDimensiune(1000);
        bazaDate1.setDimensiune(9999);
        System.out.println(bazaDate);

    }
}