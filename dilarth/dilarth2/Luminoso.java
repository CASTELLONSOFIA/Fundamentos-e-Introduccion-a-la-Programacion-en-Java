
public class Luminoso extends Cristal
{
    public Luminoso(int esencia){
        super(esencia);
    }
    public void amalgamarse(Cristal cristal){
        int actual = getEsencia() + cristal.getEsencia();
        actual = Math.abs(actual);
        //if(actual < 0) actual = actual*-1;
        setEsencia(actual);
    }
}
