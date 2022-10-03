import java.util.Scanner;

public class SortJoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada, salida, orden;
        String[] aux;
        System.out.println("introduce una lista de nombres separados por espacio: \n");
        entrada = sc.nextLine();
        aux = entrada.split(" ");
        for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux.length; j++) {
                if (aux[j].compareTo(aux[i]) < 0) {
                    orden = aux[j];
                    aux[j] = aux[i];
                    aux[i] = orden;
                }
            }

        }
        salida = String.join(", ", aux);
        System.out.println(salida);

    }

}
