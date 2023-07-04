
public class Astral extends Artefacto
{
    public Astral(int poderBase){
        super(poderBase);
    }
    public int liberarPoder(){
        int poder = getPoderBase();
        
        while(!esMistico(poder)){
            poder ++;
        }
        return poder;
    }
    private boolean esMistico(int poder){
        int sum  = 0;
        boolean esMistico = false;
        while(poder > 0){
            sum = sum + poder % 10;
            poder = poder / 10;
        }
        if(sum % 6 == 0)
            esMistico = true;    
        return esMistico;
    }
}