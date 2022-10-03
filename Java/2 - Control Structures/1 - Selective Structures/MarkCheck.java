
//MarkCheck
import java.util.Scanner;

public class MarkCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark1, mark2, mark3;
        System.out.println("Introduce 3 notas: ");
        mark1 = sc.nextInt();
        mark2 = sc.nextInt();
        mark3 = sc.nextInt();

        if (mark1 > 4 && mark2 > 4 && mark3 > 4) {
            System.out.println("Todas las notas por encima de 4");
        } else if (mark1 > 4 || mark2 > 4 || mark3 > 4) {
            System.out.println("Alguna nota mayor que 4");
        } else
            System.out.println("Todas las notas menores que 4");

    }
}