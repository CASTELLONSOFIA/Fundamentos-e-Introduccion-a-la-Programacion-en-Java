
public class Cofre
{
    public class Frase
    {
    static void hello(){
        System.out.println("PRUEBA SER DIGNO PARA LLEGAR AL COFRE Y DESCUBRIR SUS SECRETOS");
    }
    }
    private Frase frase1;
    private Frase frase2;
    public Cofre(Frase frase1, Frase frase2){
        this.frase1 = frase1;        
        this.frase2 = frase2;
    }
    
    public boolean abrirCofre(Cofre puerta){
        int numero = puerta.getFrase();
        boolean estaAbierto = false;
        if(frase >= numero)
            estaAbierto = true;
        return estaAbierto;
    }
}
