package facade;

import java.util.ArrayList;
import java.util.List;

public class Medic {
    private List<Pacient> numePacienti;

    public Medic() {
        this.numePacienti = new ArrayList<>();
    }

    public void adaugaPacient(Pacient pacient) {
        this.numePacienti.add(pacient);
    }



    public boolean verificaTrimitere(String nume)
    {
       return this.numePacienti.contains(nume);
    }


    public Pacient getPacient(String nume) {
        for (Pacient pacient : numePacienti) {
            if (pacient.getNume().equals(nume)) {
                return pacient;

            }

        }
        return null;

    }

}
