
public class Poligonal extends Simbolos
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String poligonal = scanner.nextLine();
        String segFrase = scanner.nextLine();
        char letra = poligonal.charAt(0);
        if (segFrase.length() < poligonal.length()) {
            poligonal = poligonal + " " + segFrase;
        }
        System.out.println(poligonal);
    }
    public class ConverMayus{
        public static void Poligonal(String[]args){
            String frase = "";
            System.out.println(frase);
            String answer = frase.toLowerCase();
            System.out.println(answer);
        }
    }
}
