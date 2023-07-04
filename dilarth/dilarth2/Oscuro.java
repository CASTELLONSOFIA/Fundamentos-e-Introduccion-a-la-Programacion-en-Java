
public class Oscuro extends Cristal
{
    public Oscuro(int esencia){
        super(esencia);
    }

    public void amalgamarse(Cristal cristal){
        if(cristal.getEsencia() %2 == 0)
            setEsencia(cristal.getEsencia()*getEsencia());
        else 
            setEsencia(getEsencia()-cristal.getEsencia());
    }
}