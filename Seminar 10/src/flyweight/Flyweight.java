package flyweight;

import java.util.HashMap;
import java.util.Map;

public class Flyweight {
    private Map<String, IClientBanca> mapClient;

    public Flyweight() {
        this.mapClient = new HashMap<>();
    }


    public IClientBanca getDetinator(String nume, String nrTelefon, String adresa)
    {
        if(!mapClient.containsKey(nume))
        {
            IClientBanca iClientBanca=new Detinator(nume, nrTelefon,adresa);
            mapClient.put(nume,iClientBanca);
            return iClientBanca;
        }
        return mapClient.get(nume);
    }
}
