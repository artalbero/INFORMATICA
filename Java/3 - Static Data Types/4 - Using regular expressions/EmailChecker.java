
//EMAIL CHECKER
import java.util.regex.*;
import java.util.Scanner;

public class EmailChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text;
        Pattern p;
        Matcher m;

        System.out.println("Introduce un email válido, como aaa@eee.com");
        text = sc.nextLine();

        p = Pattern.compile("\\w+[@]\\w+[.]\\w+$");

        m = p.matcher(text);

        if (m.find()) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
}