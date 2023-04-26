package facade;

public class Facade {

    private Medic medic;
    private Salon salon;

    public Facade() {
        this.medic = new Medic();
        medic.adaugaPacient(new Pacient("Ana",4));
        medic.adaugaPacient(new Pacient("Maria",5));
        this.salon = new Salon();
        salon.adaugaPatLiber(100);
        salon.adaugaPatLiber(300);
    }

    void interneaza(String nume) {
        if (medic.verificaTrimitere(nume))
        {
            if(salon.verificaPaturlibere())
            {
                if(medic.getPacient(nume).getGravitate() > 4)
                {
                    salon.ocupaPat();
                    System.out.println("Pacientul "+ nume+ " este internat");
                }
                else
                {
                    System.out.println("Pacientul nu are o stare grava");
                }
            }
            else
            {
                System.out.println("Nu exista paturi libere");
            }

        }
        else
        {
            System.out.println("Trebuie sa aveti trimitere de la medic");
        }

    }
}
