
public class Cardinal extends Cofre
{
    public static void Cardinal(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String character = scanner.nextLine();
        if (character.equals("N")) {
            System.out.println("b, d, f, h, j, k, l, m, n, p, q, t, v, w, x, y, z");
        } else if (character.equals("S")) {
            System.out.println("c, f, i, j, l, m, o, q, r, s, u, v, x, z");
        } else if (character.equals("E")) {
            System.out.println("a, c, e, g, i, k, m, o, q, s, u, w, y");
        } else if (character.equals("O")) {
            System.out.println("d, h, j, l, n, p, r, t, v, x, z");
        } else {
            System.out.println("Letra invalida");
        }
    }
}

