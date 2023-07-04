
public class Dado
{
    private char [] lados;
    public Dado(){
        lados = new char [6];
        lados[0] = '1';
        lados[1] = '2';
        lados[2] = '3';
        lados[3] = 'V';
        lados[4] = 'M';
        lados[5] = 'D';
    }
    public char girarDado(){
        int lado = (int)(Math.random()*5);
        return lados[lado];
    }
}
