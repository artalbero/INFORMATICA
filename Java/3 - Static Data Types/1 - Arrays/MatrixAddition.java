import java.util.*;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix1, matrix2;
        matrix1 = new int[3][3];
        matrix2 = new int[3][3];

        System.out.println("Introduce los datos de la matriz 1: ");
        for (int i = 0; i < 3; i++) {
            System.out.printf("Fila %d:", i + 1);
            for (int j = 0; j < 3; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Introduce los datos de la matriz 2: ");
        for (int i = 0; i < 3; i++) {
            System.out.printf("Fila %d:", i + 1);
            for (int j = 0; j < 3; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%d ", matrix1[i][j] + matrix2[i][j]);
            }
            System.out.printf("\n");
        }
    }

}
