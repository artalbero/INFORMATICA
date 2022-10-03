
//Card Check ID
import java.util.regex.*;
import java.util.Scanner;

public class CardCheckID {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text;
        Pattern p;
        Matcher m;
        System.out.println("Introduce una ID válida. Formato 1234ABC");
        text = sc.nextLine();

        // Busca 4 dígitos(\d{4}), luego 3 letras mayúsculas([A-Z]{3}) y luego el final
        // ($). Las \ se tienen que "escapar"
        p = Pattern.compile("\\d{4}[A-Z]{3}$");

        m = p.matcher(text);

        if (m.find()) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
}