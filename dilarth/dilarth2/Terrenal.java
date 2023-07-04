
public class Terrenal extends Cristal
{
    public Terrenal(int esencia){
        super(esencia);
    }
    public void amalgamarse(Cristal cristal){
        if(getEsencia()>cristal.getEsencia())
            setEsencia(getEsencia()/cristal.getEsencia());
        else
            setEsencia(cristal.getEsencia()/getEsencia());
    }
}
