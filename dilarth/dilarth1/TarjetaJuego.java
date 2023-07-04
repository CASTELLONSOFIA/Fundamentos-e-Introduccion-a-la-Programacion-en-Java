
public class TarjetaJuego
{
    private int cantVida;
    private int cantPuntos;
    public TarjetaJuego(){
        cantVida = 20;
        cantPuntos = 0;
    }
    public void cambiarVida(int vida){
        cantVida = cantVida + vida;
    }
    public void incrementarPuntos(int puntos){
        cantPuntos = cantPuntos + puntos;
    }
}
