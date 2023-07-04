
public class Juego
{
    private Jugador[] jugadores;
    private Dado[] dado;
    private int turno;
    private char [] resultadoDados;
    public Juego(Jugador [] jugadores){
        turno = 0;
        this.jugadores = jugadores;
        dado = new Dado[5];
        for(int i = 0; i < 5; i ++){
            dado[i] = new Dado();
        }
    }
    public Juego(){
        dado = new Dado[5];
        for(int i = 0; i < 5; i ++){
            dado[i] = new Dado();
        }
    }
    public int jugar(int a){
        return 0;
    }
    public char[] lanzarDado(){
        char [] resultado = new char [5];
        for(int i = 0; i < 5; i ++){
            resultado[i] = dado[i].girarDado();
        }
        return resultado;
    }
    public void atacarJugador(int indiceJugador, int vida){
        Jugador jugador = jugadores[indiceJugador];
        jugador.serAtacado(vida);
    }
    public void incrementarMonedas(int m){
        Jugador jugador = jugadores[turno];
        jugador.cambiarMoneda(m);
    }
    public void incrementarPuntosV(int p){
        Jugador jugador = jugadores[turno];
        jugador.aumentarPV(p);
    }
    public void jugar(){
        Jugador actual = jugadores[turno];
        if(turno == jugadores.length-1)
            turno = 0;
        else turno ++;
    }
    public Jugador getActual(){
        return jugadores[turno];
    }
}
