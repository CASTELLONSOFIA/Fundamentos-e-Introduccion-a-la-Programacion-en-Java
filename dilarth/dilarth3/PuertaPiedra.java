
public class PuertaPiedra
{
    private int numeroMagico;
    public PuertaPiedra(){
        numeroMagico = (int)(Math.random()*100) + 1;
    }
    public void cambiarNumero(){
        numeroMagico = (int)(Math.random()*100) + 1;
    }
    public int getNumeroMagico(){
        return numeroMagico;
    }
}
