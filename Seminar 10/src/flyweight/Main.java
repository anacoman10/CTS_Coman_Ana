package flyweight;

public class Main {
    public static void main(String[] args) {
        Flyweight flyweight=new Flyweight();

        Cont cont=new Cont(100,145);
        Cont cont1=new Cont(234,67);
        Cont cont2=new Cont(345,67);

        Detinator detinator=new Detinator("Ana","364627","str principala");
        detinator.descriere(cont);
        flyweight.getDetinator("Maria","4377634","str secundara")
                .descriere(cont);
        flyweight.getDetinator("Maria","4377634","str secundara")
                .descriere(cont1);
        flyweight.getDetinator("Maria","4377634","str secundara")
                .descriere(cont2);

        flyweight.getDetinator("Maria","4377634","str secundara")
                .descriere(cont1);

        detinator.descriere(cont1);
        detinator.descriere(cont2);


    }
}
