import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura;

        System.out.println("Introduce la altura del triángulo: ");
        altura = sc.nextInt();

        for (int i = altura; i > 0; i--) {
            for (int j = 0; j < i; j++)
                System.out.printf("*");
            System.out.printf("\n");
        }

    }
}
