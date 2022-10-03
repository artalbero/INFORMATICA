import java.util.*;

public class MarkCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[10];
        int[] markcounter = new int[11];
        int mark = 0;

        for (int i = 0; i < marks.length; i++) {
            do {
                System.out.printf("Introduce la nota número:%d; una nota entre 0 y 10: ", i + 1);
                mark = sc.nextInt();

            } while (mark < 0 || mark > 10);
            marks[i] = mark;
        }
        for (int i = 0; i < markcounter.length; i++) {
            markcounter[i] = 0;
        }
        for (int i = 0; i < marks.length; i++) {
            markcounter[marks[i]]++;
        }
        for (int i = 0; i < markcounter.length; i++) {
            System.out.printf("Número de %d: %d\n", i, markcounter[i]);
        }

    }

}
