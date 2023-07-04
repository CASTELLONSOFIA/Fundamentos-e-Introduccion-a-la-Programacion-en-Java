
public class Ficha
{
    private String nombre;
    private String elemento;
    private String nombreClave;
    
    public Ficha(String nombre, String elemento, String nombreClave){
        this.nombre = nombre;
        this.elemento = elemento;
        this.nombreClave = nombreClave;
    }
    public String getNombre(){
        return nombre;    
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
