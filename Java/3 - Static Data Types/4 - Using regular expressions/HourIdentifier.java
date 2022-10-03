
//CUIDADO CON ESTE EJERCICIO PORQUE UTILIZA UN TIPO DE DATO DINÁMICO, LA LISTA
import java.util.regex.*;
import java.util.ArrayList;
import java.util.Scanner;

public class HourIdentifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text;
        ArrayList<String> array = new ArrayList<>();

        Pattern p;
        Matcher m;

        System.out.println("introduce una hora con formato 00:00");
        text = sc.nextLine();

        p = Pattern.compile("([0-2][0-9][:][0-5][0-9])");
        m = p.matcher(text);

        if (!m.find()) {
            System.out.println("The text has no hours");
        } else {
            do {
                String name = m.group(1);

                System.out.println("Found " + name);
                array.add(name);
            } while (m.find());
        }
        // Los siguientes pasos se podrían hacer en uno solo
        // Transformamos la lista en un array
        String[] aux = new String[array.size()];
        for (int i = 0; i < aux.length; i++)
            aux[i] = array.get(i);

        // ordenamos el array
        String orden;
        for (int i = 0; i < aux.length; i++) {
            for (int j = 0; j < aux.length; j++) {
                if (aux[j].compareTo(aux[i]) > 0) {
                    orden = aux[j];
                    aux[j] = aux[i];
                    aux[i] = orden;
                }
            }

        }

        for (int i = 0; i < aux.length; i++) {
            System.out.printf("%s\n", aux[i]);
        }
    }
}
