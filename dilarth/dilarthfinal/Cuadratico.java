
public class Cuadratico extends Simbolos
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        char letraInsignia = scanner.nextLine().charAt(0);
        String[] palabras = sentence.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            palabras[i] = letraInsignia + palabras[i];
        }
        System.out.println(String.join(" ", palabras));
    }
}
