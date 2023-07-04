
public class GuardianPetreo
{
    private Artefacto artefacto1;
    private Artefacto artefacto2;
    public GuardianPetreo(Artefacto artefacto1, Artefacto artefacto2){
        this.artefacto1 = artefacto1;        
        this.artefacto2 = artefacto2;
    }
    
    public boolean abrirPuerta(PuertaPiedra puerta){
        int numero = puerta.getNumeroMagico();
        int poder = artefacto1.liberarPoder() + artefacto2.liberarPoder();
        boolean estaAbierto = false;
        if(poder >= numero)
            estaAbierto = true;
        return estaAbierto;
    }
}
