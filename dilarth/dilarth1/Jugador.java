
public class Jugador
{
    private Ficha ficha;
    private TarjetaJuego tarjeta;
    private int moneda;
    public Jugador(String nombre, String nick, String elemento){
        moneda = 0;
        ficha = new Ficha(nombre, elemento, nick);
        tarjeta = new TarjetaJuego();
    }
    public void serAtacado(int a){
        tarjeta.cambiarVida(-a);
    }
    public void cambiarMoneda(int m){
        moneda = moneda + m;
    }
    public void aumentarPV(int p){
        tarjeta.incrementarPuntos(p);
    }
}
