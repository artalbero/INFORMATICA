import java.util.Scanner;

public class GroupPeople {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total_gente;

        System.out.println("Introduce el número total de gente");
        total_gente = sc.nextInt();
        while (total_gente > 0) {
            if (total_gente > 50) {
                System.out.printf("Grupos de 50 personas: %d\n", total_gente / 50);
                total_gente = total_gente % 50;
            } else if (total_gente > 10) {
                System.out.printf("Grupos de 10 personas: %d\n", total_gente / 10);
                total_gente = total_gente % 10;
            } else {
                System.out.printf("Grupos individuales: %d\n", total_gente);
                total_gente = 0;
            }
        }
    }
}