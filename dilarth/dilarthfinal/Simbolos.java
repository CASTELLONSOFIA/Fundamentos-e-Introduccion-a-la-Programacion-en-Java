
public class Simbolos
{
    private String frase;
    public Simbolos(String frase){
        this.frase=frase;
    }
    public void analizarPrimFrase(String segFrase){
        if(frase.length()<segFrase.length()){
            frase = frase+segFrase;
        }   
    }
    public String getFrase(){    
        return frase;
    }
    public void setFrase(String frase){
        this.frase=frase;
    }
    public String liberarMemoria(){
        return "";
    }
    public String obtenerLetrasMultiplo(char direcc){
        String answer="";
            if(direcc=='N'){
                System.out.println("b, d, f, h, j, k, l, m, n, p, q, t, v, w, x, y, z");
            }
            else if(direcc=='S'){
                System.out.println("c, f, i, j, l, m, o, q, r, s, u, v, x, z");
            }
            else if(direcc=='E'){
                System.out.println("a, c, e, g, i, k, m, o, q, s, u, w, y");
            }
            else if(direcc=='O'){
                System.out.println("d, h, j, l, n, p, r, t, v, x, z");
            }
            else {
                System.out.println("Letra invalida");
        }
    }
}
