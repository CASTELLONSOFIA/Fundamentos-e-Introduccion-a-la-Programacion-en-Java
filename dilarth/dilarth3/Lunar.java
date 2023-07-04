
public class Lunar extends Artefacto
{
    public Lunar(int poderBase){
        super(poderBase);
    }
    public int liberarPoder(){
        int poder = getPoderBase();
        if(esPrimo(poder)){
            poder = sigPrimo(poder);
        }
        return poder;
    }
    
    private boolean esPrimo(int num){
        boolean primo = true;
        for(int i = 2; i<num; i ++){
            if(num%2 == 0)
                primo = false;
        }
        return primo;
    }
    private int sigPrimo(int num){
        boolean encontrado = false;
        while(!encontrado){
            num++;
            if(esPrimo(num))
                encontrado = true;
        }
        return num;
    }
}
