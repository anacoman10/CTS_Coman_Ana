import eagerInitialization.BazaDate;
import singleton.classes.Secretariat;
import singletonRegistry.InstitutiePublica;


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

        InstitutiePublica institutiePublica = InstitutiePublica.getInstitutieOptimizare("Politie");
        InstitutiePublica institutiePublica2 = InstitutiePublica.getInstitutieOptimizare("Pompieri");
        InstitutiePublica institutiePublica3 = InstitutiePublica.getInstitutieOptimizare("Politie");

        institutiePublica.setNumarAngajati(10);
        institutiePublica3.setNumarAngajati(20);
        institutiePublica2.setNumarAngajati(5);

        System.out.println(institutiePublica);
        System.out.println(institutiePublica2);
        System.out.println(institutiePublica3);
    }
}