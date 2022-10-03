import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada = 0;
        boolean numerovalido = false;

        do {

            while (!numerovalido) {
                System.out.println("Introduce un número entre 1 y 100. Introduce 0 para salir: ");
                entrada = sc.nextInt();
                if (entrada >= 0 && entrada <= 100) {
                    numerovalido = true;
                }
            }
            if (numerovalido) {
                for (int i = entrada; i > 0; i--) {
                    System.out.printf("%d ", i);
                }
                System.out.printf("\n");
            }
            numerovalido = false;
        } while (entrada != 0);

    }

}
