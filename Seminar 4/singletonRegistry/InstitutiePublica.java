public class InstitutiePublica {
    private String denumire;
    private int numarAngajati;

    private static Map<String,InstitutiePublica> registruInstitutii=new HashMap<>();

    private InstitutiePublica(String denumire, int numarAngajati) {
        this.denumire = denumire;
        this.numarAngajati = numarAngajati;
    }

    public static InstitutiePublica getInstanta(String denumire)
    {
        if(registruInstitutii.containsKey(denumire))
        {
            return registruInstitutii.get(denumire);
        }
        else
        {
            InstitutiePublica institutiePublica=new InstitutiePublica(denumire,0);
            institutiePublica.put(denumire,institutiePublica);
            return institutiePublica;
        }
    }
}
