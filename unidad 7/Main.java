
public class Main
{
    public static void main(String args[]){
        Lote[][] lotes=new Lote[4][4];
        lotes[0][0]=new Lote(29, "Castellón");
        lotes[0][1]=new Lote(4, "Torrico");
        lotes[0][2]=new Lote(6, "Escalier");
        lotes[0][3]=new Lote(12, "Argote");
        lotes[1][0]=new Lote(8, "Iturricha");
        lotes[1][1]=new Lote(1, "Unzueta");
        lotes[1][2]=new Lote(5, "Garron");
        lotes[1][3]=new Lote(19, "Catacora");
        lotes[2][0]=new Lote(30, "Pinto");
        lotes[2][1]=new Lote(20, "Andia");
        lotes[2][2]=new Lote(9, "Guzman");
        lotes[2][3]=new Lote(16, "Mancilla");
        lotes[3][0]=new Lote(7, "Rodriguez");
        lotes[3][1]=new Lote(10, "Zapata");
        lotes[3][2]=new Lote(25, "Gonzales");
        lotes[3][3]=new Lote(18, "Moreira");
        Barrio barrio=new Barrio(lotes);
        barrio.visualizar();
        System.out.println("el dueño de la mayor cant de pers es: "+barrio.nombPropMayCant());
        System.out.println("el lote con la mayor cant de pers es: "+barrio.callesLoteMayCant());
        System.out.println("el dueño de la menor cant de pers es: "+barrio.nombPropMenCant());
        System.out.println("el lote con la menor cant de pers es: "+barrio.callesLoteMenCant());
    }
}
