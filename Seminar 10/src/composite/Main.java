package composite;

public class Main {
    public static void main(String[] args) {
        UnitateBancara sucursala=new Sucursala("Sucursala1", 10);
        UnitateBancara sucursala1=new Sucursala("Sucursala2",45);

        UnitateBancara agentie1=new Sucursala("Agentie1",13);
        UnitateBancara agentie2=new Sucursala("Agentie2",35);

        UnitateBancara filiala1=new Filiala("Filiala1",23);
        UnitateBancara filiala2=new Filiala("Filiala2",3);
        UnitateBancara filiala3=new Filiala("Filiala3",34);


        sucursala.adaugaUnitate(sucursala1);
        sucursala.adaugaUnitate(agentie1);
        sucursala.adaugaUnitate(filiala1);


        sucursala1.adaugaUnitate(sucursala);
        sucursala1.adaugaUnitate(agentie2);
        sucursala1.adaugaUnitate(filiala2);


        sucursala.printeazaDescriere();
    }
}