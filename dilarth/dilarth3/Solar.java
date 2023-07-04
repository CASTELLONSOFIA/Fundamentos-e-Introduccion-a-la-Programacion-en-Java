
public class Solar extends Artefacto
{
    public Solar(int poderBase){
        super(poderBase);
    }
    public int liberarPoder(){
        int poder = getPoderBase();
        if(poder % 2 == 0)
            poder = poder * 2;
        else 
            poder = poder / 2;
        return poder;
    }
}