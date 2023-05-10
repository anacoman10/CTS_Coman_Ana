package state.clase;

public class StareLIbera implements IStare{

    @Override
    public void modificaStare(Masa masa) {
        if(!(masa.getStare() instanceof StareLIbera))
        {
            System.out.println("Masa este libera acum");
            masa.setStare(this);
        }else
        {
            System.out.println("Masa este deja libera");
        }
    }
}
